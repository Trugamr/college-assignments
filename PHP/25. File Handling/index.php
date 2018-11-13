<?php
    
    //creating file
    $file = fopen("myFile.txt" , 'w');

    //writing data to file
    fwrite($file, "Have a nice day.");

    //closing file
    fclose($file);

    //opening file in read mode
    $file = fopen("myFile.txt", 'r');

    // getting size of file
    $fsize = filesize("myFile.txt");

    //reading data from file
    $data = fread($file, $fsize);

    echo "Size of file is - $fsize bytes <br> Data inside file is - \"$data\"";
    
    //closing file
    fclose($file);

    //copying file 
    if(!copy("myFile.txt", "testFile.txt")) {
        echo "<br>Copy failed";
    } else {
        echo "<br>myFile.txt copied successfully as testFile.txt";
    }

    //renaming file
    if(!rename("testFile.txt", "finalFile.txt")) {
        echo "<br>Renaming failed";
    } else {
        echo "<br>testFile.txt renamed successfully as finalFile.txt";
    }
    
?>