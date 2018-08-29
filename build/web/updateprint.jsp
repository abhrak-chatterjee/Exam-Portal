<%-- 
    Document   : updateprint
    Created on : 12 Jul, 2017, 10:52:08 PM
    Author     : sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATION SUCCESSFUL</title>
    </head>
    <center>
    <body>
        <h1>UPDATION SUCCESSFUL</h1>
        
        <table cell padding="10" cell span="10" border="10" class="table table-box">
                <tr>
                <th style="width:200"> NAME</th>
                <th style="width:200"> ROLL</th>
                <th style="width:200"> SEMESTER</th>
                <th style="width:200"> SEMESTER MARKS</th>
            </tr>
        
    <tr>
    <td style ="width:200"><c:out value="${up.getName()}"/></td>
    <td style ="width:200"><c:out value="${up.getRoll()}"/></td>
    <td style ="width:200"><c:out value="${up.getSem()}"/></td>
    <td style ="width:200"><c:out value="${up.getSemOne()}"/></td>
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
