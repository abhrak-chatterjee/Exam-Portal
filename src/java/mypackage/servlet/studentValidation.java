/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.servlet;
import mypackage.dao.*;
import mypackage.dto.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;  
import javax.servlet.http.*;  
import static mypackage.helper.Md5Encryption.encrypt;

/**
 *
 * @author sanu
 */
public class studentValidation extends HttpServlet {
Student s;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       int fl=0;
       String sess;
       
                studentdao kl=new studentdao();
                
                if(request.getParameter("showdept")!=null)
                {
                    studentdao a=new studentdao();
                    ArrayList x=a.getalldept();
                  
                    request.setAttribute("arr1", x);
                    request.getRequestDispatcher("showdept.jsp").forward(request, response);
                }
                else if(request.getParameter("showcolg")!=null)
                {
                     studentdao a=new studentdao();
                    ArrayList x=a.getallcolg();
                   
                    request.setAttribute("arr", x);
                    request.getRequestDispatcher("showcolg.jsp").forward(request, response);
                }
                else if(request.getParameter("newdeptsname")!=null){
                    
                   String y=request.getParameter("sizelist");
                   int s=Integer.parseInt(y);
                   String n[]=new String[s];
                   String id[]=new String[s];
                    System.out.println(y);
                    for(int i=0;i<s;i++)
                    {
                        n[i]=(String)request.getParameter("deptid"+i);
                        id[i]=(String)request.getParameter("newdept"+i);
                        System.out.println(n[i]+"\t"+id[i]);
                    }
                    kl.updatedeptrecord(id,n);
                    
                    studentdao a=new studentdao();
                    ArrayList x=a.getalldept();
                  
                    request.setAttribute("arr1", x);
                    request.getRequestDispatcher("showdept.jsp").forward(request, response);
                    
                }
                
                
                
                else if(request.getParameter("updatedept")!=null)
                {
                      System.out.println("update colg");
                    studentdao a=new studentdao();
                    ArrayList x=a.getalldept();
                   for(int i=0;i<x.size();i++)
                   {
                       Department c=(Department)x.get(i);
                       System.out.println(c.getDepid()+"\t"+c.getDepname());
                       
                   }
                    request.setAttribute("arr1", x);
                    request.getRequestDispatcher("updateddept.jsp").forward(request, response);
                    
                }
               else if(request.getParameter("newcolgsname")!=null){
                    
                   String y=request.getParameter("sizelist");
                   int s=Integer.parseInt(y);
                   String n[]=new String[s];
                   String id[]=new String[s];
                    System.out.println(y);
                    for(int i=0;i<s;i++)
                    {
                        n[i]=(String)request.getParameter("newname"+i);
                        id[i]=(String)request.getParameter("colgid"+i);
                        System.out.println(n[i]+"\t"+id[i]);
                    }
                    kl.updatecolgrecord(n,id);
                     studentdao a=new studentdao();
                    ArrayList x=a.getallcolg();
                   
                    request.setAttribute("arr", x);
                    request.getRequestDispatcher("showcolg.jsp").forward(request, response);
                    
               
                    
                }
                
                
                
               else if(request.getParameter("updatecolg")!=null){
                    System.out.println("update colg");
                    studentdao a=new studentdao();
                    ArrayList x=a.getallcolg();
                   
                    request.setAttribute("arr", x);
                    request.getRequestDispatcher("updatedcolg.jsp").forward(request, response);
                    
                }
               else if(request.getParameter("adddept")!=null){
                    
                    String dep=request.getParameter("deptname");
                    String id=request.getParameter("deptid");
                    String cid=request.getParameter("colid");
                    System.out.println(cid);
                    if(!kl.checkcolgexist(cid)){
                        request.setAttribute("flag","-1");
                        request.getRequestDispatcher("adddeptpage.jsp").forward(request, response);
                    }
                    
                    else if(kl.checkdeptexist(id,cid))
                    {
                        request.setAttribute("flag","-2");
                        request.getRequestDispatcher("adddeptpage.jsp").forward(request, response); 
                    }
                    
                    else
                    {
                        kl.insertdept(dep,id,cid);
                       
                    studentdao a=new studentdao();
                    ArrayList x=a.getalldept();
                  
                    request.setAttribute("arr1", x);
                    request.getRequestDispatcher("showdept.jsp").forward(request, response);                    }
                }
               else if(request.getParameter("addcolg")!=null){
                    
                    String col=request.getParameter("colgname");
                    String id=request.getParameter("colgid");
                    System.out.println(id);
                    if(kl.checkcolgexist(id))
                    {
                        request.setAttribute("flag","-1");
                        request.getRequestDispatcher("addcolgpage.jsp").forward(request, response); 
                    }
                    
                    else
                    {
                        kl.insertcolg(col,id);
                        System.out.println("output colg success");
                        request.setAttribute("id",id);
                        request.setAttribute("flag","100");
                         studentdao a=new studentdao();
                    ArrayList x=a.getallcolg();
                   
                    request.setAttribute("arr", x);
                    request.getRequestDispatcher("showcolg.jsp").forward(request, response);
                        
                    }
                    
                }
       
             else if(request.getParameter("adminselect")!=null)
              {
                  ArrayList s1=new ArrayList();
                  studentdao ad=new studentdao();
                  System.out.println("hello");
                  String colgid=request.getParameter("college");
                  String deptid=request.getParameter("department");
                  
                  if((colgid.equals("0"))&&(deptid.equals("0"))){
                        s1=ad.getAllstud();
                       request.setAttribute("list",s1);
                       
                request.getRequestDispatcher("adminprint.jsp").forward(request, response);
                  }
                  else
                  {
                      s1=ad.colgdeptselect(colgid,deptid);
                      String size=Integer.toString(s1.size());
                      request.setAttribute("list",s1);
                      request.setAttribute("cid",colgid);
                      request.setAttribute("did",deptid);
                      request.setAttribute("flag","-1");
                      request.setAttribute("sizel",size);
                      
                request.getRequestDispatcher("adminprint.jsp").forward(request, response);
                  }
                  
              }
      
    
       else if(request.getParameter("ADMIN")!=null){//ADMINISTRATOR LOGIN
           
               request.getRequestDispatcher("admin.jsp").forward(request, response);
               }
        else if(request.getParameter("adminlogin")!=null)
        {
            studentdao ad=new studentdao();
            String uname=request.getParameter("adname");
            String upass=request.getParameter("adpass");
            
            if(ad.checkadmin(uname,upass))
            {
                ArrayList s1=ad.getAllstud();
                Student ob1=new Student();
        for(int i=0;i<s1.size();i++)
        {
           ob1=(Student)s1.get(i);
           System.out.println("\n\n"+ob1.getName()+"\t"+ob1.getRoll()+"\t"+ob1.getSem()+"\t"+ob1.getSemOne());
        }
                System.out.println("admin exists");
                String size=Integer.toString(s1.size());
                request.setAttribute("sizel",size);
                request.setAttribute("list",s1);
                request.getRequestDispatcher("adminprint.jsp").forward(request, response);
            }
            else if(uname==null)
            {
                ArrayList s1=ad.getAllstud();
                Student ob1=new Student();
                 System.out.println("admin exists");
                String size=Integer.toString(s1.size());
                request.setAttribute("sizel",size);
                request.setAttribute("list",s1);
                request.getRequestDispatcher("adminprint.jsp").forward(request, response);
            }
            else
            {
              request.getRequestDispatcher("admin.jsp").forward(request, response);  
            }
           }
        
       else if(request.getParameter("login23")!=null){//LOG IN TABLE VIEW
        String username=request.getParameter("username");
        String pass1=request.getParameter("pass");
        String pass="";
           try {
               pass = encrypt(pass1);
           } catch (Exception ex) {
               Logger.getLogger(studentValidation.class.getName()).log(Level.SEVERE, null, ex);
           }
        System.out.println(username+"\t"+pass);
        sess=request.getParameter("username");
        request.getSession().setAttribute("username",sess);
                    
            
            
        studentdao s1=new studentdao();
       
         s=s1.studentValidate(username,pass);
        if(s.getRowfetch()==-1){
            request.setAttribute("userInsert","-1");
            request.setAttribute("Reportobj",s);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            System.out.println("STUDENT DOES NOT EXIST");
        }
        else{
         
        System.out.println("STUDENT EXISTS\n\n"+s.getName()+"\t"+s.getRoll()+"\t"+s.getSem()+"\t"+s.getSemOne());
        request.setAttribute("report",s);
        request.getRequestDispatcher("userprint.jsp").forward(request, response);
        }
              }
              
              
              
              else if(request.getParameter("update")!=null)//ROUTING TO UPDATE
              {
                  
                  request.setAttribute("report",s);
                  
        request.getRequestDispatcher("update.jsp").forward(request, response);
                  
              }
              
              else if(request.getParameter("up")!=null){//UPDATED PART
       
          studentdao xt=new studentdao();
           String na=request.getParameter("upname");
           
           String x2=request.getParameter("uproll");
           
        String sem=request.getParameter("upsem");
        String marks=request.getParameter("upmarks");
        String username=request.getParameter("upusername");
        String contact=request.getParameter("upcontact");
        String address=request.getParameter("upaddress");
        String colg=request.getParameter("upcolgid");
        String dept=request.getParameter("updeptid");
        String reg=request.getParameter("upregid");
       
        
           
        
        
         
            studentdao x=new studentdao();
            Student s2=x.update(x2,na,sem,marks,username,contact,address,colg,dept,reg);
            
            request.setAttribute("report",s2);
        request.getRequestDispatcher("userprint.jsp").forward(request, response);
         
       
       }
              else if(request.getParameter("new")!=null)//NEW USER
              {
                  
                  
           String na=request.getParameter("rename");
           
           String ro=request.getParameter("reroll");
           
        String sem=request.getParameter("resem");
        String marks=request.getParameter("remarks");
        String us=request.getParameter("reusername");
        String pass=request.getParameter("repass");
        String cpass=request.getParameter("repassc");
        String con=request.getParameter("recontact");
        String add=request.getParameter("readdress");
        String rid=request.getParameter("reregid");
        String cid=request.getParameter("recolgid");
        String did=request.getParameter("redeptid");
        
        studentdao xt=new studentdao();
       if(pass.equals("cpass"))
       {
            request.setAttribute("flag","-2");
        request.getRequestDispatcher("newuser.jsp").forward(request, response);
       }
       else if((pass.length()<8))
               {
                    request.setAttribute("flag","-2");
        request.getRequestDispatcher("newuser.jsp").forward(request, response);
               }
       else if(xt.checkins(us,ro,did,cid))
       {
           request.setAttribute("flag","-1");
        request.getRequestDispatcher("newuser.jsp").forward(request, response);
       }
       else
       { String epass="";
               try {
                   epass=encrypt(pass);
               } catch (Exception ex) {
                   Logger.getLogger(studentValidation.class.getName()).log(Level.SEVERE, null, ex);
               }
           
           s=xt.insert(ro,na,sem,marks,us,epass,con,add,rid,cid,did); 
          request.setAttribute("report",s);
        request.getRequestDispatcher("userprint.jsp").forward(request, response);
          
       }
            
       }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
