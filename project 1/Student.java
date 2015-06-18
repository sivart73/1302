// Program Name   Student.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Project 1
// Due Date       6/3/2015
// Purpose        This class creates student objects

import java.lang.Math;

public class Student
{
   private String name;
   private int idNumber;
   private double gpa;
   
   // ---------------------------------------------
   //   Default constructor for student
   // ---------------------------------------------
   public Student ()
   {
      name = "";
      idNumber = 000000000;
      gpa = 0;
   }
   
   // ---------------------------------------------
   //   Constructor for student
   // ---------------------------------------------
   public Student (int anidNumber, String aname, double agpa)
   {
      name = aname;
      idNumber = anidNumber;
      gpa = agpa;
   }
   
   // -----------------------------------------------------
   //   returns the name of the Student
   // -----------------------------------------------------
   public String getName()
   {
      return name;
   }
   
   // -----------------------------------------------------
   //   returns the Social Security number of the Student
   // -----------------------------------------------------
   public int getID()
   {
      return idNumber;
   }
   
   // -----------------------------------------------------
   //   returns the GPA number of the Student
   // -----------------------------------------------------
   public double getGpa()
   {
      return gpa;
   }
   
   // -----------------------------------------------------
   //   sets the name of the Student
   // -----------------------------------------------------
   public void setName(String aname)
   {
      name = aname;
   }
   
   // -----------------------------------------------------
   //   sets the Social Security number of the Student
   // -----------------------------------------------------
   public void setID(int anidNumber)
   {
      idNumber = anidNumber;
   }
   
   // -----------------------------------------------------
   //   sets the GPA number of the Student
   // -----------------------------------------------------
   public void setGpa(double agpa)
   {
      gpa = agpa;
   }
   
// ----------------------------------------------------
//   toString returns the all the information for the student
// ----------------------------------------------------
   public String toString()
   {
      String studentInfo = idNumber + "\t" +   name +  "\t" + gpa;
      
      return studentInfo;
   }
   
// ----------------------------------------------------
//   mehtod checks if students are equal returns boolean true or false
// ----------------------------------------------------
   public boolean equals(Object o)
   {
      if (! (o instanceof Student))
      {
         return false;
      }
      
      Student objStudent = (Student) o;
      if (name.equals(objStudent.name) 
             && idNumber == objStudent.idNumber
             && Math.abs(gpa - objStudent.gpa) < .0001)
      {
         return true;
      }
      else
      {
         return false;
      }   
   }
}