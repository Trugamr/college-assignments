<?php
    $phones = array(
        array("Apple", 2, 16),
        array("Moto", 4, 32),
        array("Samsung", 3, 64)
    );

    echo "Phone Specifications - <br>";
    echo $phones[0][0] . " - " . $phones[0][1] . "GB RAM, " . $phones[0][2] . "GB Storage. <br>";
    echo $phones[1][0] . " - " . $phones[1][1] . "GB RAM, " . $phones[1][2] . "GB Storage. <br>";
    echo $phones[2][0] . " - " . $phones[2][1] . "GB RAM, " . $phones[2][2] . "GB Storage."; 
?>