// Program Name   Array2DTest.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 3
// Due Date       6/1/2015
// Purpose        Class for adding up 2D array elements by column and by row


// Array2DTest.java
// simple use of two-dimensional arrays

public class Array2DTest
{
public static void main (String[] args)
{
 int [] [] A = new int [2] [5]; // 2 rows, 5 columns
 // fill each cell with the sum of its row and column numbers
 for (int i = 0; i < 2; i++)
 {
  for (int j = 0; j < 5; j++)
  {
   A[i] [j] = i + j;
  }
 }
 int [] [] B = {{1,2,3,4,5}, {6,7,8,9,10}}; 
 // 2 rows, 5 columns
 System.out.println ("A.length = " + A.length);
 System.out.println ("B.length = " + B.length);
 System.out.println ("Number of columns in A is " + A[0].length);
 System.out.println ("Number of cells in A is " + A.length * A[0].length);
 // compute row sums for B
 for (int i = 0; i < B.length; i++)
 {
 int sum = 0;
  for (int j = 0; j < B[i].length; j++)
  {
   sum = sum + B[i] [j];
  }
  System.out.println ("The sum of row " + i + " is " + sum);
 }
 // compute column sums for B here

  for (int j = 0; j < B[0].length; j++)
 {
 int sum = 0;
    for (int i = 0; i < B.length; i++)
  {
   sum = sum + B[i] [j];
  }
  System.out.println ("The sum of column " + j + " is " + sum);
 }
 System.out.println ("Coded by Travis Clement");
}
}
