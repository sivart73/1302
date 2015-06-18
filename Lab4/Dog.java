// Program Name   Dog.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 4
// Due Date       6/1/2015
// Purpose        Class for creating dog objects



import java.util.Scanner;

public class Dog
{
  protected String breed;
  protected int weight;
  protected char sex;
  protected Date birth;
  
  
// ----------------------------------------------------
//   Default constructor
// ----------------------------------------------------
  public Dog ()
  {
    breed = "";
    weight = 0;
    sex = 'n';
    birth = new Date();
  }
  
// ----------------------------------------------------
//   constructor with parameters
// ----------------------------------------------------
  public Dog (String abreed,int aweight,char asex,Date abirthdate)
  {
    breed = abreed;
    weight = aweight;
    sex = asex;
    birth = abirthdate;
  }
  
// ----------------------------------------------------
//   toString returns the all the information for the dog
// ----------------------------------------------------
   public String toString()
   {
      String doginfo = "Breed: " + breed + "\nWeight: " + weight + "\nSex: " + sex
                       + "\nBirthday: " + birth;
      
      return doginfo;
   }
  
// ----------------------------------------------------
//   mehtod checks if dogs are equal returns boolean true or false
// ----------------------------------------------------
   public boolean equals(Object o)
   {
      if (! (o instanceof Dog))
      {
         return false;
      }
      
      Dog objDog = (Dog) o;
      if (breed.equals(objDog.breed) 
             && weight == objDog.weight && sex == objDog.sex 
             && birth == objDog.birth)
      {
         return true;
      }
      else
      {
         return false;
      }   
   }
}