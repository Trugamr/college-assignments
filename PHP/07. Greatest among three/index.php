<?php
    $A = 10;
    $B = 20;
    $C = 30;

    if($A > $B && $A > $C) {
        echo "A is the greatest.";
    } else if ($B > $A && $B > $C) {
        echo "B is the greatest.";
    } else if ($C > $A && $C > $B) {
        echo "C is the greatest.";
    } else {
        echo "Make sure values of A, B and C are unique.";
    }
?>