<%-- 
    Document   : update
    Created on : 11 Jul, 2017, 11:57:55 AM
    Author     : sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE DETAILS</title>
    </head>
      <center>
    <body>
        <h4 style="color:red">
                          <% String flag=(String)request.getAttribute("flag");
                          if(flag==null)
                            flag="0";
                          else if(flag.equals("-1")){%>ROLL NUMBER IN THIS CLASS ALREADY EXISTS<%}%></h4>
        <h1>UPDATE DETAILS</h1>
        <form action="studentValidation" METHOD="Post">
            
            <% String roll=(String)request.getSession().getAttribute("rollno"); %>
  <p><font size="5" color= black>
  Roll:<br>
    <input type="text" name="uproll" value="${report.getRoll()}"readonly><br><br>
  <p><font size="5" color= black>
  Name:<br>
    <input type="text" name="upname" value="${report.getName()}" required><br><br>
    <p><font size="5" color= black>
  Username<br>
    <input type="text" name="upusername" value="${report.getEmail()}" readonly><br><br>
  <p><font size="5" color= black>
  Semester:<br>
    <input type="text" name="upsem" value="${report.getSem()}" required><br><br>
  <p><font size="5" color= black>
    Semester Marks:<br>
    <input type="text" name="upmarks" value="${report.getSemOne()}" required><br><br>
     <p><font size="5" color= black>
    Contact:<br>
    <input type="text" name="upcontact" value="${report.getContact()}" required ><br><br>
     <p><font size="5" color= black>
    Address:<br>
    <input type="text" name="upaddress" value="${report.getAddress()}" required><br><br>
     Registration ID:<br>
    <input type="text" name="upregid" value="${report.getRegId()}" readonly><br><br>
    College:<br>
     <select name="upcolgid" readonly>
                
               
              
                <option value="117">RCCIIT</option>
                <option value="118">HERITAGE INSTITUTE OF TECHNOLOGY</option>
                <option value="119">MEGHNAD SAHA INSTITUTE OF TECHNOLOGY</option>
                
                
            </select>
   
     
     
    <br><br>
     Department:<br>
    <select name="updeptid" readonly>
                
               
                
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                
                
            </select>
    <br>
    <br>
    
    
    
  <button style="color:black" type="submit" name="up" value="Update">Update</button>
  
</form>
    </body>
      </center>
</html>
