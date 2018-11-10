<?php
    $arr = array(20, 2, 8, 5, 9);

    echo "print_r() function to print array values with indexes - ";
    print_r($arr);
    echo "<br>array_sum() function to return sum of values of array - " . array_sum($arr);
    echo "<br>asort() function to sort array - ";
    asort($arr);
    foreach($arr as $item) { echo "$item &nbsp;";}
    echo "<br>asort() function to sort array in descending order - ";
    arsort($arr);
    foreach($arr as $item) { echo "$item &nbsp;"; }
    echo "<br>array_slice() function to return selected parts of array - ";  
    foreach(array_slice($arr, 1, 3) as $item) { echo "$item &nbsp;"; }

?>