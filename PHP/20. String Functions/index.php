<html>
    <head>
        <title>String Functions</title>
    </head>
    <body>
        <?php
            $str = "hello world";

            echo "strpos() function to find position of \"wo\" - " . strpos($str, "wo");
            echo "<br>substr() function to get substring from 6th index with length 3 - " . substr($str, 6, 3); 
            echo "<br>ucwords() function to capitalize first character of word - " . ucwords($str);
            echo "<br>strrev() function to reverse string - " . strrev($str);
            echo "<br>strlen() function to get lenght of string - " . strlen($str);
            echo "<br>strreplace() function to replace charcter 'o' with 'x' - " . str_replace("o" , "x", $str);
            
        ?>
    </body>
</html>