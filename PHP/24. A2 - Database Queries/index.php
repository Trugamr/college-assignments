<?php
    $server = "localhost";
    $username = "root";
    $password = "";
    
    $conn = mysqli_connect($server, $username, $password);

    if(mysqli_connect_error($conn)) {
        die("Connection to server failed.");
    } else {
        echo "Connection successful.";
    }

    //creating database
    $sql = "CREATE DATABASE EMPLOYEES_DB";
    mysqli_query($conn, $sql);  
    
    //selecting database
    mysqli_select_db($conn, "EMPLOYEES_DB");

    //dropping table if existing
    $sql = "DROP TABLE EMPLOYEES";
    mysqli_query($conn, $sql);  

    //creating table
    $sql = "CREATE TABLE EMPLOYEES (ID INT(4), NAME VARCHAR(20), JOIN_DATE DATE, DESIGNATION VARCHAR(20), SALARY INT(10))";
    mysqli_query($conn, $sql);

    //inserting values
    $sql = "INSERT INTO EMPLOYEES (ID, NAME, JOIN_DATE, DESIGNATION, SALARY) VALUES(001, 'John', '2018-01-10', 'MANAGER', 10000)";
    mysqli_query($conn, $sql);
    $sql = "INSERT INTO EMPLOYEES VALUES(002, 'Jane', '2018-01-12', 'DESIGNER', 8000)";
    mysqli_query($conn, $sql);
    $sql = "INSERT INTO EMPLOYEES VALUES(003, 'Ray', '2018-01-14', 'EMPLOYEE', 8000)";
    mysqli_query($conn, $sql);
    $sql = "INSERT INTO EMPLOYEES VALUES(004, 'Jonas', '2018-02-12', 'CLERK', 5000)";
    mysqli_query($conn, $sql);
    $sql = "INSERT INTO EMPLOYEES VALUES(005, 'Rajesh', '2018-02-04', 'EMPLOYEE', 8000)";
    mysqli_query($conn, $sql);

    //selecting employees with salary 8000
    $sql = "SELECT * FROM EMPLOYEES WHERE SALARY=8000";
    $data = mysqli_query($conn, $sql);
    
    echo "<br>
    <h3>Employees with salary 8000</h3>
    <table>
        <tr>
            <th>ID</th> <th>NAME</th> <th>JOIN DATE</th> <th>DESIGNATION</th> <th>SALARY</th>
        </tr>
    ";

    while($row = mysqli_fetch_array($data)) {
        echo "<tr>
            <td>$row[0]</td> <td>$row[1]</td> <td>$row[2]</td> <td>$row[3]</td> <td>$row[4]</td>
        </tr>";
    }

    echo "</table>";


    //updating salary for id 001
    $sql = "UPDATE EMPLOYEES SET SALARY=12000 WHERE ID=001";
    mysqli_query($conn, $sql);
    
    //deleting person with id 003
    $sql = "DELETE FROM EMPLOYEES WHERE ID=003";
    mysqli_query($conn, $sql);


     //selecting employees with salary 8000
     $sql = "SELECT * FROM EMPLOYEES";
     $data = mysqli_query($conn, $sql);
     
     echo "<br>
     <h3>Final Table</h3>
     <table>
         <tr>
             <th>ID</th> <th>NAME</th> <th>JOIN DATE</th> <th>DESIGNATION</th> <th>SALARY</th>
         </tr>
     ";
 
     while($row = mysqli_fetch_array($data)) {
         echo "<tr>
             <td>$row[0]</td> <td>$row[1]</td> <td>$row[2]</td> <td>$row[3]</td> <td>$row[4]</td>
         </tr>";
     }

    //closing connection
    mysqli_close($conn);
?>