<%-- 
    Document   : userprint
    Created on : 11 Jul, 2017, 9:30:58 AM
    Author     : sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center>
        <title>STUDENT VALIDATION SUCCESSFUL</title>
    </center>
        
        <style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 30%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: #4CAF50;
    color: white;
}



.head {
    
    padding: 15px;
}

.vids {
    width: 30%;
    float: left;
    padding: 15px;
    
}
.login {
    width: 40%;
    float: left;
    padding: 15px;
   
}
.pics{

width: 30%;
    float: right;
    padding: 15px;
    
    }
        
        
        
        
        
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 8px 16px;
    text-align:center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}

.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button1:hover {
    background-color: #4CAF50;
    color: white;
}

.button2 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button2:hover {
    background-color: #3366ff;
    color: white;
}





input[type=text1], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=password], select {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 20px 28px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}

video {
    
    max-width: 100%;
    

</style>
        
        
    </head>
     <center>
    <body>
        
         <ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#images">Images</a></li>
  <li><a href="#videos">Videos</a></li>
  <li><a href="#facts">Facts</a></li>
   <li><a href="#admin">Contact</a></li>
    <li><a href="#about">About</a></li>
  <li style="float:right"><a class="active" href="admin.jsp">ADMIN</a></li>
</ul>
        
        <h1>STUDENT DETAILS</h1>
        
        
        <table id="customers">
                <tr>
                <th > NAME</th>
                <td><c:out value="${report.getName()}"/></td>
                </tr>
                <tr>
                <th> ROLL</th>
                 <td><c:out value="${report.getRoll()}"/></td>
                </tr>
                <tr>
                <th> SEMESTER</th>
                 <td><c:out value="${report.getSem()}"/></td>
                </tr>
                <tr>
                <th> SEMESTER MARKS</th>
                 <td><c:out value="${report.getSemOne()}"/></td>
                </tr>
                <tr>
                <th> USERNAME</th>
                <td><c:out value="${report.getEmail()}"/></td>
                </tr>
                <tr>
                <th> ADDRESS</th>
                <td><c:out value="${report.getAddress()}"/></td>
                </tr>
                <tr>
                <th> CONTACT</th>
                 <td><c:out value="${report.getContact()}"/></td>
                </tr>
                <tr>
                <th> REGISTRATION ID</th>
                 <td><c:out value="${report.getRegId()}"/></td>
                </tr>
                <tr>
                <th> DEPARTMENT ID</th>
                 <td><c:out value="${report.getDeptId()}"/></td>
                </tr>
                <tr>
                <th> COLLEGE ID</th>
                 <td><c:out value="${report.getColgId()}"/></td>
            </tr>
        
   
        </table><br><br>
        <form action="index.jsp">
            <button style="color:black" type="submit" name="logout" value="Submit">LOG OUT</button>
        </form>
        <br><br>
        <form action="studentValidation" Method="Post">
    <button style="color:black" type="submit" name="update" value="Submit">UPDATE</button>
        </form>
    </body>
    </center>
</html>
