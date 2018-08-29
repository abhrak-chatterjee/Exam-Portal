<%-- 
    Document   : adddeptpage
    Created on : 20 Jul, 2017, 12:03:08 PM
    Author     : sanu
--%>
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Department</title>
    </head>
    <center>
    <h1>ADD DEPARTMENT</h1>
    </center>
    <body>
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
        <% String x=(String)request.getAttribute("id");
             %>
     <form action="studentValidation" method="Post">
    
         <center> 
             <p><font size="5" color= black>

  Enter Department name<br>
             
  
    <input type="text" name="deptname" required><br><br>
             <p> <font size="5" color= black>
  Enter Department Id<br>        
        <input type="text" name="deptid" required><br><br>
        
    <p> <font size="5" color= black>
  Enter College Id<br>        
        <input type="text" name="colid" required><br><br>
            
    
        <button style="color:black" type="submit" name="adddept" value="Update">ENTER</button>
             </center>
     </form>
</body>
</html>
