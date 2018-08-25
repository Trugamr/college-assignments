<?php
    echo "Hello from main file <br>";

    //no error if file not found, continue execution
    include "file1.php";

    //error if file not found, stop execution
    require "file2.php";
?>