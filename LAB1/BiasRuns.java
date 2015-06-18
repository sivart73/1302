// Program Name			BiasRuns.java
// Course					CSE1302J
// Name					   Travis Clement
// Assignment				Lab 1
// Due Date					5/20/2015
// Purpose					Flipping a biases coin

import java.util.Scanner;  
public class BiasRuns 
{     
  public static void main (String[] args)     
  {  
    final int FLIPS = 100;
    // number of coin flips   
    int numheads = 0;
    int numtails = 0;
  
// Create a coin object  
    Biascoin coin = new Biascoin(.7);
    
    // Flip the coin FLIPS times  
    for (int i = 0; i < FLIPS; i++)      
    {   
      coin.flip();
      if (coin.getFace() == 0)
      {
        
       numheads++;
      }
      else 
      {
        numtails++;
      }
   
    }  

  // Print the results  
     System.out.println("Number of heads is: " + numheads);
     System.out.println("Number of tails is: " + numtails);
     System.out.println ("Coded by Travis Clement");
    
  } 
} 