// Program Name   ArrayCreate.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 3
// Due Date       6/1/2015
// Purpose        Class for adding up 2D array elements by column and by row


import java.util.Scanner;

public class ArrayCreate
{
  
  public static void main(String[] args) 
  {
    
    //gather first array list of data from console
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the number of rows");
    int R = in.nextInt();
    
    System.out.print("Please enter the number of columns");
    int C = in.nextInt();
    
    int [][] newArray = new int [R][C];
    
    for (int i = 0; i < newArray.length; i++)
    {
      for (int j = 0; j < newArray[i].length; j++)
      {
        newArray[i][j] = 0;
      }
    }    
  }
}

    