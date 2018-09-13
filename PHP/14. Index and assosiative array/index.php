<?php
    $numbers = array(10, 20, 30);
    $numbers[3] = 40;

    echo " Index array - <br>";
    print_r($numbers); 

    $studentMarks = array("Jane" => 30, "Ron" => 40, "Kyle" => 25);
    $studentMarks["Devon"] = 20;

    echo "<br><br> Associative array - <br>";
    print_r($studentMarks);
?>