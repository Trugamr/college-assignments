<?php
    $oldStudents = array("Rohan", "Raghav", "Rajesh");
    $newStudents = array("Sohail", "Sumit");

    echo "Array before splicing - ";
    print_r($oldStudents);

    array_splice($oldStudents, 1, 2, $newStudents);

    echo "<br><br>Array after splicing - ";
    print_r($oldStudents);
?>