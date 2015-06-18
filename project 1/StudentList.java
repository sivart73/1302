// Program Name   StudentList.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Project 1
// Due Date       6/3/2015
// Purpose        Class for studentlist - array of student objects 

import java.util.*;

public class StudentList
{
   
   private Student[] studentArray;
   private int count;

   // ---------------------------------------------
   //   Constructor for StudentList
   // ---------------------------------------------
   public StudentList ()
   {
      studentArray = new Student[5];
      count = 0;
   }   

   // -----------------------------------------------------
   //  Add new student to Studentlist array
   // -----------------------------------------------------
   public void addStudent (int id, String name,double grade)
   {
      if (count == studentArray.length)
      {
         increaseSize();
      }
      studentArray[count] = new Student (id, name, grade);
      count++;
   }
  
   // -----------------------------------------------------
   //  sequential search in Studentlist array of Student objects
   // -----------------------------------------------------  
   public int seqsearch (String searchTerm)
   {  
      for (int i = 0; i < studentArray.length; i++)
      {
         if (studentArray[i].getName().equals(searchTerm))
         {   
            return i;
         }      
      }
      return -1;
   }
   
   // -----------------------------------------------------
   //  Numerical sort Studentlist array of Student objects
   //  by ID number in descending order
   // -----------------------------------------------------  
   public void numsort ()
   {  
      for (int i = 0; i < studentArray.length - 1; i++)
      {
         for (int j = i+1; j < studentArray.length; j++)
            if (studentArray[i].getID() < studentArray[j].getID())
            {   
               Student temp = studentArray[i] ;
               studentArray[i] = studentArray[j] ;
               studentArray[j] = temp;
            }      
      }
   }
   
   // -----------------------------------------------------
   //  Alphabetical sort Studentlist array of Student objects
   //  by name
   // -----------------------------------------------------  
   public void namesort ()
   {  
      for (int i = 0; i < studentArray.length - 1; i++)
      {
         for (int j = i + 1; j < studentArray.length; j++)
            if ((studentArray[i].getName()).compareTo(studentArray[j].getName()) > 0)
            {   
               Student temp = studentArray[i] ;
               studentArray[i] = studentArray[j] ;
               studentArray[j] = temp;
            }      
      }
   }
   
   // -----------------------------------------------------
   //  Binary search of Studentlist array of Student objects
   //  by ID - array already sorted in descending order
   // -----------------------------------------------------  
   public int binarySearch (int target)
   {  
      int first = 0, middle, last = studentArray.length - 1;        
      while (first <= last)   
      {      
         middle = (first + last)/2;      
         if (studentArray[middle].getID() == target)    
         {          
            return middle;    
         }      
         else if (studentArray[middle].getID() > target)    
         {
            first = middle + 1;    
         }
         else       
         {
            last = middle - 1;  
         }
      }   
      return -1;  
   } 

   // -----------------------------------------------------
   //  Method to increase size of Studentlist array
   // -----------------------------------------------------  
   private void increaseSize()    
   {
      Student [] temp = new Student [studentArray.length + 1];
      
      for (int i = 0; i < studentArray.length; i++)
      {
         temp[i] = studentArray[i];
      }
      studentArray = temp;
   } 
   
// ----------------------------------------------------
//   toString returns Studentlist array of student objects
//   one Student object per line 
// ----------------------------------------------------
   public String toString()
   {
      String returnValue = "";
      for (int i =0; i < studentArray.length; i++)
      {
         returnValue += studentArray[i] + "\n"; 
      }
      return returnValue;
   }
}