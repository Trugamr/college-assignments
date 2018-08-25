<?php
    $name = "Jane";
    function myFunction() {
        $name = "John";
        echo "Name inside function - $name <br>";
    }

    function myFunction2() {
        global $name;
        echo "Name inside 2nd function - $name <br>";
    }

    myFunction();
    echo "Name outside function - $name <br>";
    myFunction2();        
?>