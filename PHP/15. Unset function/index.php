<?php
    $students = array("Ron", "Harry", "Draco", "James");
    
    echo "Array before unset - ";
    print_r($students);

    unset($students[2]);

    echo "<br><br>Array after unset - ";
    print_r($students);
?>