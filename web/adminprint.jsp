<%-- 
    Document   : adminprint
    Created on : 17 Jul, 2017, 9:37:31 AM
    Author     : sanu
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackage.dto.Student"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 

<style>

    .btn-group button {
    background-color: #4CAF50; /* Green background */
    border: 1px solid green; /* Green border */
    color: white; /* White text */
    padding: 10px 24px; /* Some padding */
    cursor: pointer; /* Pointer/hand icon */
    float: left; /* Float the buttons side by side */
}

/* Clear floats (clearfix hack) */
.btn-group:after {
    content: "";
    clear: both;
    display: table;
}

.btn-group button:not(:last-child) {
    border-right: none; /* Prevent double borders */
}

/* Add a background color on hover */
.btn-group button:hover {
    background-color: #3e8e41;
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


</style>


  




            <%!String a,b,c;%>
             <% 
                 if(request.getAttribute("flag")==null){
                   c="0"; 
                   a="0";
                   b="0";
                  
                 }
                 else if((String)request.getAttribute("flag")=="-1")
                 {
                     a=(String)request.getAttribute("cid");
                     b=(String)request.getAttribute("did");
                 }
  
 
  %>

        <style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 40%;
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
</style>
        
        





<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LIST OF STUDENTS</title>
    </head>
    <body><CENTER>
        <H1>WELCOME TO ADMINISTRATOR PORTAL</H1>
    </center>
        
<div class="btn-group" style="width:100%">
    <form action="studentValidation" method="Post">
         <button style="width:14.27%" type="submit" name="adminlogin" value="222">Home</button>
      <input type="hidden" name="adname" value="admin">
      <input type="hidden" name="adpass" value="password">
    </form>
     <form action="addcolgpage.jsp">
         <button style="width:14.27%"type="submit" name="add" value="222">Add College</button>
         </form>
           <form action="adddeptpage.jsp">
         <button style="width:14.27%"type="submit" name="add1" value="222">Add Dept.</button>
         
     </form>  
    
   
   
  <form action="studentValidation" method="Post">
     
  <button style="width:14.27%"type="submit" name="updatecolg" value="222">Update College</button>
  <button style="width:14.27%"type="submit" name="updatedept" value="222">Update Dept.</button>
   <button style="width:14.27%"type="submit" name="showcolg" value="222">Show Colleges</button>
 <button style="width:14.27%"type="submit" name="showdept" value="222">Show Department</button>
  </form>
</div>
         <center>
        <h1>LIST OF STUDENTS</h1>
   
        <table id="customers">
            <tr>
                <th>NAME</th>
                <th>ROLL</th>
                <th>SEMESTER</th>
                <th>SEMESTER MARKS</th>
                <th>USERNAME</th>
                <th>CONTACT</th>
                <th>COLLEGE ID</th>
                <th>DEPARTMENT ID</th>
                <th>ADDRESS</th>
                <th>REGISTRATION ID</th>
                
            
            
            
            </tr>
            
            <%! int norecord=0; %>
            <%ArrayList siz=(ArrayList)request.getAttribute("list");%>
            
            <c:forEach items="${list}" var="list1">
                       <tr>
                <td> <c:out value="${list1.getName()}"/></td>
                <td> <c:out value="${list1.getRoll()}"/></td>
                <td> <c:out value="${list1.getSem()}"/></td>
                <td> <c:out value="${list1.getSemOne()}"/></td>
                <td> <c:out value="${list1.getEmail()}"/></td>
                <td> <c:out value="${list1.getContact()}"/></td>
                <td> <c:out value="${list1.getColgId()}"/></td>
                <td> <c:out value="${list1.getDeptId()}"/></td>
                
                <td> <c:out value="${list1.getAddress()}"/></td>
                <td> <c:out value="${list1.getRegId()}"/></td>
                
                
            <%norecord=norecord+1; %>
                      
            </tr>
              </c:forEach>
              </table>
             <br
                           <p>Total Number of Students:-</p>
                       <%out.println(siz.size());%>
                       <br>
            
           
                      
                      
             <br><br><p>SELECT COLLEGE:</p>
            <form action="studentValidation" method="Post">
            
                
                
                <% if(a.equals("0")){%>
                
                        <select name="college">
                <option value="0"selected>ALL</option>
                <option value="117">RCCIIT</option>
                <option value="118">HIT</option>
                <option value="119">BIT</option>
                        </select>
                        <% }
                        
                       else if(a.equals("117")){%>
                       
                 
                 
                       
                        <select name="college">
                <option value="0">ALL</option>
                <option value="117"selected>RCCIIT</option>
                <option value="118">HIT</option>
                <option value="119">BIT</option>
                
                        </select>
                        <% }

        else if(a.equals("118")){%>
                
                        <select name="college">
                            
                <option value="0">ALL</option>
                <option value="117">RCCIIT</option>
                <option value="118"selected>HIT</option>
                <option value="119">BIT</option>
                
                        </select>
                        <% }



       else if(a.equals("119")){%>
               
                        <select name="college">
                <option value="0">ALL</option>
                <option value="117">RCCIIT</option>
                <option value="118">HIT</option>
                <option value="119"selected>BIT</option>
                        </select>
                        <% }



                %>
                
                
                
             
                
          
                
                <br><br>
                <p>SELECT DEPARTMENT:</p>
                
                
                
                  
                <% if(b.equals("0")){%>
                
                        <select name="department">
                <option value="0"Selected>ALL</option>
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }

                           
                 else if(b.equals("1")){%>
                
                        <select name="department">
                <option value="0">ALL</option>
                <option value="1"selected>ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }


                        else if(b.equals("2")){%>
                
                        <select name="department">
                <option value="0">ALL</option>
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2"selected>COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }

                        else if(b.equals("3")){%>
                
                        <select name="department">
                <option value="0">ALL</option>
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3"selected>ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }

                        else if(b.equals("4")){%>
                
                        <select name="department">
                <option value="0">ALL</option>
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4"selected>ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }
                        else if(b.equals("5")){%>
                
                        <select name="department">
                <option value="0">ALL</option>
                <option value="1"selected>ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5"selected>INFORMATION TECHNOLOGY</option>
                        </select>
                        <% }

%>
              
                <br><br><br>
                 <button style="color:black" type="submit" name="adminselect" value="Update">ENTER</button>
            </form>
            
               
    </center>
    </body>
</html>
