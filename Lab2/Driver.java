// Program Name   Driver.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 2
// Due Date       5/27/2015
// Purpose        This is a Driver class for testing Item and ShoppingCart classes


import java.util.Scanner;  
public class Driver 
{     
  public static void main (String[] args)     
  {  
    ShoppingCart newcart = new ShoppingCart();  
    
    Item item;  
    String itemName;  
    double itemPrice;  
    int quantity;  
    
    Scanner scan = new Scanner(System.in);   
    String keepShopping = "y";   
    do       
    {  
      System.out.print ("Enter the name of the item: ");    
      itemName = scan.next();    
      System.out.print ("Enter the unit price: ");  
      itemPrice = scan.nextDouble();    
      System.out.print ("Enter the quantity: ");  
      quantity = scan.nextInt();   
      
      // *** create a new item and add it to the cart 
      newcart.addToCart(itemName,itemPrice,quantity);
      
      // *** print the contents of the cart object using println
      System.out.println (newcart);  
      System.out.print ("Continue shopping (y/n)? ");  
      keepShopping = scan.next();     
    }  
    while (keepShopping.equals("y"));  
    System.out.println ("Please pay: " + newcart.getTotal());  
     System.out.println ("Coded by Travis Clement");
  } 
  
} 