<?php
    $names = array("Jane", "Jack", "Devon", "Karl", "Kenny");
    
    echo "for simple array- <br>";
    foreach ($names as $name) {
        echo "$name <br>";
    }

    $prizes = array("First" => "Gold Medal", "Second" => "Silver Medal", "Third" => "Bronze Medal");

    echo "<br>for associative array - <br>";
    foreach ($prizes as $position => $prize) {
        echo "$position - $prize<br>";
    }
?>