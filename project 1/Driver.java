// Program Name   Driver.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Project 1
// Due Date       6/3/2015
// Purpose        This is a driver for an array of student objects


import java.util.Scanner;  
public class Driver 
{     
   private StudentList mystudent;
   
   public static void main (String[] args)     
   {  
      // ---------------------------------------------
      //Create the studentlist array of Student objects
      // ---------------------------------------------
      StudentList mystudent = new StudentList (); 
      mystudent.addStudent(7632,"Smith",3.2);
      mystudent.addStudent(2222,"Williams",1.9);
      mystudent.addStudent(1234,"Anderson",2.4); 
      mystudent.addStudent(4990,"Roth",3.5);
      mystudent.addStudent(6129,"Collins",4.0); 
      mystudent.addStudent(3458,"Edwards",2.8); 
      mystudent.addStudent(6577,"Patrick",2.1); 
      mystudent.addStudent(9967,"Gordon",1.5);
      mystudent.addStudent(5000,"Taylor",3.9);
      
      // ---------------------------------------------
      //Print the array of student objects 
      // ---------------------------------------------
      System.out.println ("Original array of Students");
      System.out.println (mystudent);
      
      // ---------------------------------------------
      // Run method that does sequential search of the Student list 
      // ---------------------------------------------
      System.out.println ("Sequential search for Roth and Jones");
      seqsearch(mystudent);
      
      // ---------------------------------------------
      //Run Studentlist method that does sorting by name 
      // ---------------------------------------------
      mystudent.namesort();
      System.out.println ("Sorting by names");
      System.out.println (mystudent);
      
      // ---------------------------------------------
      //Run Studentlist method that does sorting by descending ID number 
      // ---------------------------------------------
      mystudent.numsort();
      System.out.println ("Sorting by ID's");
      System.out.println (mystudent);
      
      // ---------------------------------------------
      // Do binary search for 4990 and 3333 - array assumed
      // already sorted in descending order
      // ---------------------------------------------
      System.out.println ("Binary search for 4990 and 3333");
      binsearch(mystudent);
   }
   
   
// ---------------------------------------------  
// Method of sequential search with Roth and Jones as the search terms
// ---------------------------------------------
   
   public static void seqsearch (StudentList searching)
   {
      String [] target = {"Roth","Jones"};
      
      for (int i = 0; i < target.length; i++)
      {
         int index = searching.seqsearch(target[i]);
         
         if (index != -1)
         {
            System.out.println (target[i] + " was found at location " + index);
         }
         else
         {
            System.out.println (target[i] + " was not found\n");
         }
      }
   }
// ---------------------------------------------  
// Method of binary search with 4990 and 3330 as the search terms
// ---------------------------------------------
   
   public static void binsearch (StudentList searching)
   {
      int [] target = {4990, 3333};
      
      for (int i = 0; i < target.length; i++)
      {
         int index = searching.binarySearch(target[i]);
         
         if (index != -1)
         {
            System.out.println (target[i] + " was found at location " + index);
         }
         else
         {
            System.out.println (target[i] + " was not found\n");
         }
      }
      
   } 
}