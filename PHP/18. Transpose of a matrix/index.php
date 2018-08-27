<?php
    $matrix = array(
        array(1, 2, 3),
        array(4, 5, 6),
        array(7, 8, 9)
    );
    
    echo "MARIX - <br>";
    printArray($matrix);

    echo "<br><br>TRANSPOSE - <br>";
    $transpose = getTranspose($matrix);
    printArray($transpose);


    function printArray($matrix) {
        foreach($matrix as $row) {
            foreach($row as $col) {
                echo "$col &nbsp;";
            }
            echo "<br>";
        }
    }

    function getTranspose($matrix) {
        $transpose;
        for($i=0; $i<count($matrix); $i++) {
            for($j=0; $j<count($matrix[0]); $j++) {
                $transpose[$i][$j] = $matrix[$j][$i];
            }
        }
        return $transpose;
    }
?>