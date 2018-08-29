<%-- 
    Document   : newuser
    Created on : 13 Jul, 2017, 10:39:41 AM
    Author     : sanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

input[type=password1], select {
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER HERE</title>
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
        <h1>STUDENT REGISTRATION</h1>
        
        <h4 style="color:red">
                          <% String flag=(String)request.getAttribute("flag");
                          if(flag==null)
                            flag="0";
                          else if(flag.equals("-1")){%>USERNAME OR ROLL NUMBER ALREADY EXISTS<%}%></h4>
                          <% 
                          if(flag==null)
                            flag="0";
                          else if(flag.equals("-2")){%>PASSWORD INVALID<%}%></h4>
         <form action="studentValidation" METHOD="Post">
            
             
             
             
        <table id="customers">
             <tr>
                <th > USERNAME</th>
                <td><input type="text" name="reusername" required></td>
                </tr>
                 <tr>
                <th > PASSWORD</th>
                <td><input type="password" name="repass" required></td>
                </tr>
                 <tr>
                <th > CONFIRM PASSWORD</th>
                <td><input type="password" name="repassc" required></td>
                </tr>
                <tr>
                <th > NAME</th>
                <td><input type="text" name="rename" required></td>
                </tr>
                <tr>
                <th> ROLL</th>
                 <td><input type="text" name="reroll"required ></td>
                </tr>
                <tr>
                <th> SEMESTER</th>
                 <td><input type="text" name="resem" required></td>
                </tr>
                <tr>
                <th> SEMESTER MARKS</th>
                 <td><input type="text" name="remarks" required></td>
                </tr>
                
                <tr>
                <th> ADDRESS</th>
                <td><input type="text" name="readdress" required></td>
                </tr>
                <tr>
                <th> CONTACT</th>
                 <td><input type="text" name="recontact" required ></td>
                </tr>
                <tr>
                <th> REGISTRATION ID</th>
                 <td><input type="text" name="reregid"  required></td>
                </tr>
                
               
   
        </table>
             
             
             
             
             
             
             <br>   <br>  
     College:<br>
     <select name="recolgid">
                
               
              
                <option value="117">RCCIIT</option>
                <option value="118">HERITAGE INSTITUTE OF TECHNOLOGY</option>
                <option value="119">MEGHNAD SAHA INSTITUTE OF TECHNOLOGY</option>
                
                
            </select>
   
     
     
     <br><br>
     Department:<br>
    <select name="redeptid">
                
               
                
                <option value="1">ELECTRICAL ENGINEERING</option>
                <option value="2">COMPUTER SCIENCE ENGINEERING</option>
                <option value="3">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                <option value="4">ELECTRONICS AND ELECTRICAL ENGINEERING</option>
                <option value="5">INFORMATION TECHNOLOGY</option>
                
                
            </select>
     <br><br>
  <button style="color:black" type="text" name="new" value="Update">COMPLETE REGISTRATION</button>
  
</form>
        
    </body>
    </center>
</html>
