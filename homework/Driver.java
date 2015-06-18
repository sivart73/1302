// Program Name   Driver.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Homework 1 
// Due Date       5/27/2015
// Purpose  used to test the Student Class

import java.util.Scanner;

public class Driver
{
  public static void main (String[] args)
  {
    
    //Create first student object 
    Student firstStudent = new Student("Bob Smith",123456789,3.5);
    
    // Create second student with default constructor
    Student secondStudent = new Student();
    
    //test the set/mutator methods
    secondStudent.setName("John Doe");
    secondStudent.setSSN(987654321);
    secondStudent.setGpa(4.0);
    
    //test the get/accessor methods using the firstStudent object
    String secondName = secondStudent.getName();
    int secondSSN = secondStudent.getSSN();
    double secondGPA = secondStudent.getGpa();
    
    // print out to be sure the get methods worked
    System.out.println("Get Method Test Second Student\nName: " + secondName + 
                       "\nSocial Security Number: " + secondSSN +
                       "\nGPA: " + secondGPA + 
                       "\n------------------------------------");
   
    
    //Testing the toString Method using first student
    System.out.println ("toString Method test\n" + firstStudent);
    
    
    //equals method test
    System.out.println ("\nequals method first test" +
                          "\nIs firstStudent equal to secondStudent - true/false? " 
                          + firstStudent.equals(secondStudent));
    
    //creating third student to test equals method more 
    Student thirdStudent = new Student("Bob Smith",123456789,3.5);
    System.out.println ("\nequals method second test\n" +
                          "Is firstStudent equal to thirdStudent - true/false? " 
                          + firstStudent.equals(thirdStudent));
    
    System.out.println ("\nCoded by Travis Clement");
  }
  
}
