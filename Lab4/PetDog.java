// Program Name   Petdog.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 4
// Due Date       6/1/2015
// Purpose        Class for creating pet dog objects



import java.util.Scanner;

public class PetDog extends Dog
{
  protected String owner;
  protected String address;
  public PetDog ()
  {
    
  }
  
  public PetDog (String abreed,int aweight,char asex,Date abirthday,String anowner,String anaddress)
  {
    super(abreed,aweight,asex,abirthday);
    owner = anowner;
    address = anaddress;
  }
  
  
// ----------------------------------------------------
//   toString returns the all the information for the petdog
// ----------------------------------------------------
   public String toString()
   {
      String doginfo = "Breed: " + breed + "\nWeight: " + weight + "\nSex: " + sex
                       + "\nBirthday: " + birth + "\nOwner: " + owner +
                       "\nAddress: " + address;
      
      return doginfo;
   }
  
  
  public boolean equals(Object o)
  {
    if (! (o instanceof PetDog))
    {
      return false;
    }
    
    PetDog objPetDog = (PetDog) o;
    if (breed.equals(objPetDog.breed) 
          && weight == objPetDog.weight && sex == objPetDog.sex 
          && birth == objPetDog.birth && owner.equals(objPetDog.owner)  
          && address.equals(objPetDog.address))
    {
      return true;
    }
    else
    {
      return false;
    }   
  }
}