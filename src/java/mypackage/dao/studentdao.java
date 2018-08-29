/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.dao;
import mypackage.dto.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author sanu
 */
public class studentdao {
    
    
    public void updatedeptrecord(String name[],String id[])
    {
        
        
        
        
        try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt1=con.createStatement();
     
      ResultSet rs=stmt1.executeQuery("select * from department");
       
    
      int l=id.length;
      System.out.println(l);
      for(int i=0;i<l;i++)
      {
          String stmt="UPDATE department SET dept_name='"+name[i]+"' WHERE dept_id='"+id[i]+"'";
          PreparedStatement stmt2=con.prepareStatement(stmt);
          stmt2.executeUpdate();
      }
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        

        
        
        
        
        
        
        
    }
    
    
    
    
    
    public ArrayList getalldept()
    {
         ArrayList s=new ArrayList();
         
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     
      ResultSet rs=stmt.executeQuery("select distinct dept_id,dept_name from department ");
       
     while(rs.next())
     {Department s3=new Department();
        s3.setDepname(rs.getString(1));
        s3.setDepid(rs.getString(2));
              s.add(s3);
         
            
         
     }
     
      
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        return s;

    }
    
    
    public void updatecolgrecord(String name[],String id[])
    {
        
        
        
        
        try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt1=con.createStatement();
     
      ResultSet rs=stmt1.executeQuery("select * from college");
       
    
      int l=id.length;
      for(int i=0;i<l;i++)
      {
          String stmt="UPDATE college SET colg_name='"+name[i]+"' WHERE colg_id='"+id[i]+"'";
          PreparedStatement stmt2=con.prepareStatement(stmt);
          stmt2.executeUpdate();
      }
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        

        
        
        
        
        
        
        
    }
    
    
    public ArrayList getallcolg()
    {
         ArrayList s=new ArrayList();
         
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     
      ResultSet rs=stmt.executeQuery("select * from college");
       
     while(rs.next())
     {College s3=new College();
        s3.setColid(rs.getString(2));
        s3.setColname(rs.getString(1));
              s.add(s3);
         
            
         
     }
     
      
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        return s;

    }
    
    
     public void insertdept(String name,String id,String col)
    {
        System.out.println("method dept");
        
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    System.out.println("gg0");
     Statement stmt=con.createStatement();
     System.out.println("gg1");
      ResultSet rs=stmt.executeQuery("select * from department");
      
      String stmt1="INSERT into department(dept_name,dept_id,colg_id) VALUES('"+name+"','"+id+"','"+col+"')";
         PreparedStatement stmt2=con.prepareStatement(stmt1);
     
     
    stmt2.executeUpdate();
     
     System.out.println("new department registraion succesful");
      
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
       
        
        
        
        
        
    }
    
     
    public boolean checkdeptexist(String deptid,String cid)
    {
       
        int flag=0;
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     Statement stmt2=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from department");
     ResultSet sr=stmt2.executeQuery("select * from college");
     
     while(rs.next())
     {
         
        if((rs.getString(2).equals(deptid))&&(rs.getString(3)).equals(cid))
         {
             flag=1;
             break;
             
         }
        
        
         
     }
   
     
     
 
   }
   catch(SQLException sqle) {

       System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        
       if(flag==1)
         return true;
     else 
         return false; 
      
        
        
    }
    
    
    
    
    
    public void insertcolg(String name,String id)
    {
        System.out.println("method colg");
        
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    System.out.println("gg0");
     Statement stmt=con.createStatement();
     System.out.println("gg1");
      ResultSet rs=stmt.executeQuery("select * from college");
      
      String stmt1="INSERT into college(colg_name,colg_id) VALUES('"+name+"','"+id+"')";
         PreparedStatement stmt2=con.prepareStatement(stmt1);
     
     
    stmt2.executeUpdate();
     
     System.out.println("new colg registraion succesful");
      
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
       
        
        
        
        
        
    }
    
    public boolean checkcolgexist(String colgid)
    {
       System.out.println(colgid);
        int flag=0;
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from college");
     
     while(rs.next())
     {
         
        if((rs.getString(2).equals(colgid)))
         {
             flag=1;
             System.out.println(colgid+"\t"+rs.getString(2));
         }
        
        
         
     }
     
     
 
   }
   catch(SQLException sqle) {

       System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        
       if(flag==1)
         return true;
     else 
         return false; 
      
        
        
    }
    
    
    
    
    public Student studentValidate(String user,String pass ){
        Student s2=new Student();
        
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from student_valid1");
     int flag=-1;
     while(rs.next())
     {
          if ((rs.getString(5).equals(user))&&(rs.getString(6).equals(pass)))
         {
             flag=1;
             s2.setName(rs.getString(1));
             s2.setRoll(rs.getString(2));
             s2.setSem(rs.getString(3));
             s2.setSemOne(rs.getString(4));
             s2.setEmail(rs.getString(5));
             s2.setPassword(rs.getString(6));
             s2.setAddress(rs.getString(7));
             s2.setContact(rs.getString(8));
             s2.setRegId(rs.getString(9));
             s2.setDeptId(rs.getString(10));
             s2.setColgId(rs.getString(11));
         }
         
         
     }
     
     if(flag==-1)
         s2.setRowfetch(-1);
     else
         s2.setRowfetch(1);
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        
        
    return s2;    
        
        
    }
    
    public Student update(String roll,String name,String sem,String marks,String username,String contact,String address,String co, String de, String reg)
    {
        Student s3=new Student();
        int sem1=0;
         String stmt;
         
        Student s1=new Student();
        try{
          Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt1=con.createStatement();
     ResultSet rs=stmt1.executeQuery("select * from student_valid1");
    
    
     
         
         
         stmt="UPDATE student_valid1 SET STUD_NAME='"+name+"',STUD_SEM='"+sem+"',STUD_MARK='"+marks+"',STUD_ADD='"+address+"',STUD_CONTACT='"+contact+"' WHERE STUD_ROLL='"+roll+"'";
         PreparedStatement stmt2=con.prepareStatement(stmt);
         int x=stmt2.executeUpdate();
         System.out.println(x);
         
          s3.setName(name);
             s3.setRoll(roll);
             s3.setSem(sem);
             s3.setSemOne(marks);
             s3.setAddress(address);
             s3.setEmail(username);
             s3.setContact(contact);
             s3.setColgId(co);
             s3.setDeptId(de);
             s3.setRegId(reg);
             
            
        }
      
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
         
         return s3; 
    }
    
    public boolean checkins(String r,String roll, String depid,String colgid)
    {
       
        int flag=0;
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from student_valid1");
     
     while(rs.next())
     {
         
        if((rs.getString(5).equalsIgnoreCase(r)))
         {
             flag=1;
         }
        else if(rs.getString(2).equals(roll)&&(rs.getString(10).equals(depid))&&(rs.getString(11).equals(colgid))){
         flag=1;
        }
         
     }
     
     
 
   }
   catch(SQLException sqle) {

       System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        
       if(flag==1)
         return true;
     else 
         return false; 
      
        
        
    }
    public Student insert(String roll,String name,String sem,String marks,String username,String pass,String contact,String address,String regid,String colgid,String deptid){
        
        Student s4=new Student();
       
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    System.out.println("gg0");
     Statement stmt=con.createStatement();
     System.out.println("gg1");
      ResultSet rs=stmt.executeQuery("select * from student_valid1");
      
      String stmt1="INSERT into student_valid1(STUD_NAME,STUD_ROLL,STUD_SEM,STUD_MARK,STUD_USERNAME,STUD_PASS,STUD_ADD,STUD_CONTACT,STUD_REGID,STUD_DEPTID,STUD_COLGID) VALUES('"+name+"','"+roll+"','"+sem+"','"+marks+"','"+username+"','"+pass+"','"+address+"','"+contact+"','"+regid+"','"+deptid+"','"+colgid+"')";
         PreparedStatement stmt2=con.prepareStatement(stmt1);
     System.out.println("ggg");
     boolean a=rs.next();
    stmt2.executeUpdate();
     
     System.out.println("new user registraion succesful");
      s4.setName(name);
             s4.setRoll(roll);
             s4.setSem(sem);
             s4.setSemOne(marks);
             s4.setAddress(address);
             s4.setContact(contact);
             s4.setColgId(colgid);
             s4.setRegId(regid);
             s4.setDeptId(deptid);
             s4.setPassword(pass);
             s4.setEmail(username);
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        return s4;
        
        
    }
    public boolean checkadmin(String uname,String pass)
    {
        int flag=0;
        
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     
      ResultSet rs=stmt.executeQuery("select * from admin_table");
       
     while(rs.next())
     {
         
        if((rs.getString(1).equals(uname))&&(rs.getString(2).equals(pass)))
         {
             flag=1;
         }
         
            
         
     }
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        if(flag==1)
            return true;
        else
            return false;
    }
    public ArrayList getAllstud()
    {
        ArrayList s=new ArrayList();
         
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     
      ResultSet rs=stmt.executeQuery("select * from student_valid1");
       
     while(rs.next())
     {Student s3=new Student();
         s3.setName(rs.getString(1));
             s3.setRoll(rs.getString(2));
             s3.setSem(rs.getString(3));
             s3.setSemOne(rs.getString(4));
            s3.setEmail(rs.getString(5));
            s3.setAddress(rs.getString(7));
            s3.setContact(rs.getString(8));
            s3.setRegId(rs.getString(9));
            s3.setDeptId(rs.getString(10));
                    s3.setColgId(rs.getString(11));
              s.add(s3);
         
            
         
     }
     
      
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        return s;
    }
    public ArrayList colgdeptselect(String colgid,String deptid)
    {
         ArrayList s=new ArrayList();
         
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     
      ResultSet rs=stmt.executeQuery("select * from student_valid1");
       if((!colgid.equals(""))&&(deptid.equals("0"))){
     while(rs.next())
         
     {
         if(rs.getString(11).equals(colgid)){
         
         Student s3=new Student();
         s3.setName(rs.getString(1));
             s3.setRoll(rs.getString(2));
             s3.setSem(rs.getString(3));
             s3.setSemOne(rs.getString(4));
            s3.setEmail(rs.getString(5));
            s3.setAddress(rs.getString(7));
            s3.setContact(rs.getString(8));
            s3.setRegId(rs.getString(9));
            s3.setDeptId(rs.getString(10));
                    s3.setColgId(rs.getString(11));
              s.add(s3);
         
            
         }
     }
       }
       else if((colgid.equals("0"))&&(!deptid.equals(""))){
     while(rs.next())
         
     {
         if(rs.getString(10).equals(deptid)){
         
         Student s3=new Student();
         s3.setName(rs.getString(1));
             s3.setRoll(rs.getString(2));
             s3.setSem(rs.getString(3));
             s3.setSemOne(rs.getString(4));
            s3.setEmail(rs.getString(5));
            s3.setAddress(rs.getString(7));
            s3.setContact(rs.getString(8));
            s3.setRegId(rs.getString(9));
            s3.setDeptId(rs.getString(10));
                    s3.setColgId(rs.getString(11));
              s.add(s3);
         
            
         }
     }
       }
        else if((!colgid.equals(""))&&(!deptid.equals(""))){
     while(rs.next())
         
     {
         if((rs.getString(10).equals(deptid))&&(rs.getString(11).equals(colgid))){
         
         Student s3=new Student();
         s3.setName(rs.getString(1));
             s3.setRoll(rs.getString(2));
             s3.setSem(rs.getString(3));
             s3.setSemOne(rs.getString(4));
            s3.setEmail(rs.getString(5));
            s3.setAddress(rs.getString(7));
            s3.setContact(rs.getString(8));
            s3.setRegId(rs.getString(9));
            s3.setDeptId(rs.getString(10));
                    s3.setColgId(rs.getString(11));
              s.add(s3);
         
            
         }
     }
       }
     
      
     
      
      
     
     
    
     
     
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }   
        return s;
    }
    
     
    public boolean checkinsupdate(String r,String roll, String depid,String colgid)
    {
       
        int flag=0;
         try{
       
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     

// line below needs to be modified to include the database name, user, and password (if any)



        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:16000;databaseName=TRAINING;user=sa;password=12345");




  
     System.out.println("Connected to database !");
    
     Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from student_valid1");
     
     while(rs.next())
     {
       
        if(rs.getString(2).equals(roll)&&(rs.getString(10).equals(depid))&&(rs.getString(11).equals(colgid))){
         flag=1;
        }
         
     }
     
     
 
   }
   catch(SQLException sqle) {

       System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }    
        
        
        
       if(flag==1)
         return true;
     else 
         return false; 
      
        
        
    }
   
        
    
   
    

}