// Program Name   ArrayCreate.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 3
// Due Date       6/1/2015
// Purpose        Class for adding up 2D array elements by column and by row
//                using a file as input

import java.util.Scanner;
import java.io.*;

public class ArrayCreate
{
  public	static void	main(String[] args) throws	IOException
  {
	 Scanner	in	= new	Scanner (new File("input.txt"));
	 int R =	in.nextInt();
	 int C =	in.nextInt();
    
    // setting all the array values to zero
	 int [][] newArray =	new int [R][C];
		for (int	i = 0; i	< newArray.length; i++)
		 {
		  for	(int j =	0;	j < newArray[i].length;	j++)
			{
			  newArray[i][j] = 0;
			}
		 }	
       
     //initialling variables
	 int row	= 0;
	 int column	= 0;
	 int data =	0;
    // loop to add items to the array
	 while (row	!=	-1	&&	column != -1 && data	!=	-1)
	   {
	   row = in.nextInt();
	   column = in.nextInt();
	   data	= in.nextInt();
	
	   if (row	!=	-1	&&	column != -1 && data	!=	-1)
		   {
		     newArray[row][column]	= data;
		   }
	   }
    // Loop to print out the contents of the array
    for (int i	= 0; i <	newArray.length; i++)
	   {
	     System.out.println();
		    for (int	j = 0; j	< newArray[i].length; j++)
		      {
		        System.out.print(newArray[i][j]	+ "\t");
		      }
	   }	
  }
}
	 