<?php

    //creating a directory 
    if(!mkdir("fruits")) {
        echo "Directory already exists <br>";
    } else {
        echo "Directory successfully created <br>";
    }

    //opening a directory
    $pets = opendir("pets");

    //reading file names in directory
    echo "<br>Files insidde \"pets\" directory -<br>";
    while($fileName = readdir($pets)) {
        echo "filename: $fileName <br>";
    }

    //closing directory
    closedir($pets);

    //removing directory
    if(!rmdir("fruits")) {
        echo "<br>Removing directory failed.";
    } else {
        echo "<br>\"fruits\" directory removed successfully";
    }
?>