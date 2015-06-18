// Program Name   shop.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 2
// Due Date       5/27/2015
// Purpose        This creates arraylist of items

// *************************************************************** 
//   Shop.java 
// 
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************  
import java.util.ArrayList; 
import java.util.Scanner;  
public class Shop 
{     
  public static void main (String[] args)     
  {  
    ArrayList<Item> cart = new ArrayList<Item>();  
    Item item;  String itemName;  
    double itemPrice;  
    int quantity;    
    double totalPrice = 0.0;
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
      cart.add(new Item (itemName,itemPrice,quantity));
     
      // *** print the contents of the cart object using println 
       System.out.println ("Item\tUnitPrice\tQuantity\tTotal");
      for (Item temp: cart)
      {
        System.out.println (temp.getName() + "\t" + temp.getPrice() + "\t" + temp.getQuantity() + "\t$" + temp.getQuantity() * temp.getPrice()); 
        totalPrice += (temp.getQuantity() * temp.getPrice());
      }
      System.out.println ("Total so far = $" + totalPrice); 
 
      System.out.print ("Continue shopping (y/n)? ");  
      keepShopping = scan.next();  
     
    }  
    while (keepShopping.equals("y"));   
    System.out.println ("Total price = $" + totalPrice);
     System.out.println ("Coded by Travis Clement");
  } 
  

} 