<?php
    $servername = "localhost";
    $username = "root";
    $password = "";

    $con = mysqli_connect($servername, $username, $password, 'bca');
    
    $fname = $_POST["fname"];
    $lname = $_POST["lname"];
    $roll = $_POST["roll"];
    $age = $_POST["age"];

    $sql = "insert into students values('$fname', '$lname', '$roll', '$age')";

    if(!mysqli_query($con, $sql)) {
        echo "Data couldn't be added";
    } else {
        echo "Data added successfully";
    };
?>