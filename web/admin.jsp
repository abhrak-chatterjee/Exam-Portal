<%-- 
    Document   : admin
    Created on : 14 Jul, 2017, 11:18:30 AM
    Author     : sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
    <body>
        
         <form action="studentValidation" METHOD="Post">
            
    <p><font size="5" color=black> 
        USERNAME:<br>
  <input type="text"  name="adname" required><br><br>
  
  <p><font size="5" color= black>
  PASSWORD:<br>
    <input type="password" name="adpass" required><br><br>
  
  <button style="color:black" type="submit" name="adminlogin" value="Submit">LOGIN</button>
  
  
  
        </form><br><br>
    
        
    </body>
    </center>
</html>
