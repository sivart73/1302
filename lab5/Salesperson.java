// Program Name   Salesperson.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 5
// Due Date       6/10/2015
// Purpose        Class for salesperson objects
//                

// ******************************************************
//   Salesperson.java
//
//   Represents a sales person who has a first name, last
//   name, and total number of sales.
// *******************************************************

public class Salesperson implements Comparable
   
{
   
   private String firstName, lastName;
   private int totalSales;
   
   //------------------------------------------------------
   //  Constructor:  Sets up the sales person object with
   //                the given data.
   //------------------------------------------------------
   
   public Salesperson (String first, String last, int sales)
   {
      firstName = first;
      lastName = last;
      totalSales = sales;
   }
   
   //-------------------------------------------
   //  Returns the sales person as a string.
   //-------------------------------------------
   
   public String toString()
   {
      return lastName + ", " + firstName + ": \t" + totalSales;
   }
   
   //-------------------------------------------
   //  Returns true if the sales people have
   //  the same name.
   //-------------------------------------------
   
   public boolean equals (Object other)
   {
      return (lastName.equals(((Salesperson)other).getLastName()) &&
               firstName.equals(((Salesperson)other).getFirstName()));
   }
   
   
   //--------------------------------------------------
   //  Order is based on total sales with the name
   //  (last, then first) breaking a tie.
   //--------------------------------------------------
   
   public int compareTo(Object other)
   {
      int result;
      Salesperson objsales = (Salesperson) other;
      if (this.totalSales < objsales.totalSales )
      {
         result = -1;
      }
      else if (this.totalSales == objsales.totalSales
                 && this.lastName.equals(objsales.lastName) 
                 && this.firstName.compareTo(objsales.firstName) > 0)
      {
         return -1; 
      }    
      else if (this.totalSales == objsales.totalSales
                 && this.lastName.compareTo(objsales.lastName) > 0)
      {
         return -1; 
      }       
      else
      {
         result = 1;
      }
      return result;
   }
   
   //-------------------------
   //  First name accessor.
   //-------------------------
   public String getFirstName()
   {
      return firstName;
   }
   
   //-------------------------
   
   //  Last name accessor.
   
   //-------------------------
   
   public String getLastName()
   {
      return lastName;
   }
   
   
   //-------------------------
   //  Total sales accessor.
   //-------------------------
   
   public int getSales()
      
   {
      return totalSales;
   }
   
}