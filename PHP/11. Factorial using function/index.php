<?php
    $number = 6;

    $factorial = fact($number);
    
    echo "Factorial of $number is $factorial";

    function fact($n) {
        $fact = 1;
        for($i = 1; $i <= $n; $i++) {
            $fact = $fact * $i;
        }
        return $fact;
    }
?>