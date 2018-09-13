<html>
<head>
    <title>Page Title</title>
</head>
<body>
    <?php
        $servername = "localhost";
        $username = "root";
        $password = "";

        $con = mysqli_connect($servername, $username, $password);
        
        if(mysqli_connect_error($con)) {
            echo "Connection Failed : " . mysqli_connect_errno($con) . "<br>" . mysqli_connect_error();
        } else {
            echo "Connection Successful!";
        }

        $sql = "CREATE DATABASE BCA";
        $con->query($sql);
        // or mysqli_query($con, $sql);

        if($con->error) {
            echo "<br> Database couldn't be created : " . $con->error;
        } else {
            echo "<br> Database created Successfuly";
        }
        
        $con->close();
    ?>
</body>
</html>