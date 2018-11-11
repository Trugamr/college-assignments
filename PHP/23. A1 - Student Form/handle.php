<?php

    //saving form data to cookies
    foreach($_POST as $key => $value) {
        setcookie($key, $value, time() + 60*60*24);
    }

    //getting form data from cookies
    foreach($_COOKIE as $key => $value) {
        echo strtoupper($key) . " : $value <br>";
    }
?>