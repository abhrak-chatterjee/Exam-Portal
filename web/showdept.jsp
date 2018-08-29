

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackage.dto.Student"%>
<%@page import="mypackage.dto.Department"%>
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
        
        <title>LIST OF DEPARTMENTS</title>
    </head>
    <body><CENTER>
        <h1>LIST OF DEPARTMENTS</h1>
    </CENTER>
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
  </form><BR><BR>
        </div><br><br>
         <center>
        
   
        <table id="customers">
            <tr>
                <th>DEPARTMENT ID</th>
                <th>DEPARTMENT </th>
                
                
            
            
            
            </tr>
            
            <%! int norecord=0; %>
            <%
            ArrayList a1=new ArrayList();
            a1=(ArrayList)request.getAttribute("arr1");
            
            
          
            String name1="";
            String id1="";
            
            int i;

            %>
             
                 
            <%for ( i=0;i<a1.size();i++){%>
            <% Department b=(Department)a1.get(i); 
            name1=b.getDepname();
             id1=b.getDepid();
           
            
            
            %>
                       <tr>
                       
                           <td> <input type="text" name="deptid<%=i%>" value="<%= name1 %>" readonly/></td>
                           <td> <input type="text" name="nmae" value="<%= id1 %>" readonly/></td>
               
                    
           
                
                
                
            <%}%>
                      
            </tr>
              
              </table>
               
 
          
              

         </center>
</body>
</html>
