<?php
    $name = "Jane";
    $age = 20;

    echo "Name - $name & Age - $age at start. <br><br>";

    fun1($name, $age);
    echo "Name - $name & Age - $age after call by value function. <br><br>";    

    fun2($name, $age);
    echo "Name - $name & Age - $age after call by value function. <br><br>";

    //call by value function
    function fun1($n, $a) {
        echo "Call by value | Age of $n is $a <br>";

        $n = "John";
        $a = "22";
    }

    //call by reference function
    function fun2(&$n, &$a) {
        echo "Call by refernce | Age of $n is $a <br>";

        $n = "Devon";
        $a = "23";
    }

?>