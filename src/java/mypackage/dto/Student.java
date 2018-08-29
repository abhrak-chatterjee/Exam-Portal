/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.dto;





public class Student
{
    private String name;
    private String roll,sem;
   private String semOne;
   private int rowFetch;
   private int level;
   private String message;
   private String email;
   private String password;
   private String address;
   private String address2;
   private String contact;
   private String regId;
   private int su;
   private String deptid;
   private String colgid;
   
   
   public String getContact()
   {
       return contact;
   }
   public String getAddress()
   {
       return address;
   }
   public String getRegId()
   {
       return regId;
   }
           
           
           
           
           
   public void setColgId(String a)
   {
       this.colgid=a;
   }
   public void setDeptId(String a)
   {
       this.deptid=a;
   }
   
   public String getColgId()
   {
       return colgid;
   }
   public String getDeptId()
   {
       return deptid;
   }
   
   public void setSu(int s)
   {
       this.su=s;
   }
   public void setAddress(String address)
   {
       this.address=address;
   }
   public void setAddress2(String address)
   {
       this.address=address2;
   }
    public void setContact(String c)
    {
        this.contact=c;
    }
    public void setRegId(String c)
    {
        this.regId=c;
    }
    
   
   
   
   public int getRowfetch()
   {
       return rowFetch;
   }
   public int getLevel()
   {
       return level;
   }
   public String getEmail()
   {
       return email;
   }
   public String getPassword()
   {
       return password;
   }
    public void setRowfetch(int a1)
    {
        this.rowFetch=a1;
    }
    
     public void setLevel(int a3)
    {
        this.level=a3;
    }
    public void setMessage(String a2)
    {
        this.message=a2;
    }
    public void setEmail(String x)
     {
         this.email=x;       
     }
    public void setPassword(String p)
    {
        this.password=p;
    }
    
    public void setName(String s)
    {
        this.name=s;
    }
    
    public void setRoll(String a)
    {
        this.roll=a;
    }
    
    public void setSem(String c)
    {
        this.sem=c;
    }
    
    public void setSemOne(String x)
    {
      this.semOne=x;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getRoll()
    {
        return this.roll;
    }
    public String getSem()
    {
        return this.sem;
    }
    public String getSemOne()
    {
        return this.semOne;
    }
    
    
}
        