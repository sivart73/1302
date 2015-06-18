// Program Name   Driver.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab4
// Due Date       6/3/2015
// Purpose        This is a driver creating dogs and pet dogs


import java.util.Scanner;  
public class Driver 
{     
  
  
  public static void main (String[] args)     
  {  
    // Setting updates for birthdates
    Date dog1birth = new Date(4,30,2010);
    Date dog2birth = new Date (3,20,1950);
    
    //creating dog objects
    Dog spot = new Dog("pitbull",45,'F',dog1birth);
    Dog snoopy = new Dog("beagle",25,'M',dog2birth);
    // snoopy2 object just for testing equals
    Dog snoopy2 = new Dog("beagle",25,'M',dog2birth);
    
    // Creating petdog objects
    PetDog tiger = new PetDog("retriever",65,'M',dog2birth,"John Doe","1234 Main St, Atlanta, GA 30316");
    //tiger2 object for testing equals
    PetDog tiger2 = new PetDog("retriever",65,'M',dog2birth,"John Doe","1234 Main St, Atlanta, GA 30316");
    PetDog lucy = new PetDog("poodle",51,'F',dog1birth,"Jane Smith","5678 Peachtree St, Atlanta, GA 30303");
    
    //printing all dog and petdog objects
    System.out.println("\nSpot\n" + spot);
    System.out.println("\nSnoopy\n" + snoopy);
    System.out.println("\nTiger\n" + tiger);
    System.out.println("\nLucy\n" + lucy);
    
    //Testing equals method for dog and petdog
    System.out.println("Does snoopy equal spot? True/False: " + spot.equals(snoopy));
    System.out.println("Does snoopy equal snoopy2? True/False: " + snoopy.equals(snoopy2));
    System.out.println("Does tiger equal lucy? True/False: " + tiger.equals(lucy));
    System.out.println("Does tiger equal tiger2? True/False: " + tiger.equals(tiger2));
  }
  
  
}