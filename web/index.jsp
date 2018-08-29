<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <%@ page import="mypackage.dto.Student"%>
    <head>
        <title>STUDENT VALIDATION</title>
        <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=2.0">
    </head>
    
    <style>
        
        
        
        * {
    box-sizing: border-box;
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
    
    
}





</style>
    
    
    
    
     
        
  <body background="add.jpg">
      
   
  
  <% String userInsert=(String)request.getAttribute("userInsert");
  Student obj;
  if(request.getAttribute("Reportobj")!=null)
  {
      obj=(Student)request.getAttribute("Reportobj");
  }
  else 
      userInsert="0";
  if(userInsert==null)
      userInsert="0";
 
  
                      
                      %>
  <center>
                      <h4 style="color:red">
                          <% if(userInsert.equals("-1")){%>PLEASE INPUT CORRECT DETAILS<%}%></h4>
                          <div class="head">
                              <p><font size="7" color="white">STUDENT VALIDATION APPLICATION</font></p>
  </center>
      
  
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
  </div>
 
 
      <div class="pics">
          <p><font size="6" color="white"> Random Facts </p>
       
          <img src="2.jpg"  alt="fact1" width="400" height="200"><br>
          <br>
              <img src="3.jpg"  alt="fact2" width="400" height="200">
              </div> 
                          
               <div class="vids">
                  <p><font size="6" color="white"> Random Videos </p>
                  <video controls width="400" height="220">
                        <source src="video2.mp4" type="video/MP4" >
                  </video>
                  
                  <video controls width="400" height="220">
                    <source src="video3.mp4" type="video/MP4" >
                  </video>
                 </div>
                          <center>
            <div class="login">
                <form action="studentValidation" METHOD="Post">
         <font size="5" color=white>Username:
  <input type="text1"  name="username" placeholder="Username..." required><br>
  
  
  <font size="5" color=white>Password:
    <input  type="password"  name="pass" placeholder="Password..." password required><br>
  
    <button class="button button1" type="submit" name="login23" value="Submit">LOGIN</button><br>
        </form>
   <form action="newuser.jsp">
            <button class="button button2" type="new user" name="up" value="Update">REGISTER</button>
       </form>
                <br>
                <p> Welcome to Student Validation Portal.<br>
                    Please enter your Username and Password to see your details.
                    If you do not have an account please click on the Register button and register now.
                    Feel free to browse through the amazing contents. </p>
         
            </div>
                              
         </center>
                      
    </body>
    
</html>
