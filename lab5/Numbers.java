
// Program Name   Numbers.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 5
// Due Date       6/10/2015
// Purpose        Class for creating number objects
//                and sorting them


// ******************************************************
//   Numbers.java
//
//   Demonstrates selectionSort on an array of integers.
// ******************************************************

import java.util.Scanner;

public class Numbers

{
    // --------------------------------------------
    //  Reads in an array of integers, sorts them,
    //  then prints them in sorted order.
    // --------------------------------------------

    public static void main (String[] args)
    {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();


        Sorting.bubbleSort(intList);
 
        System.out.println ("\nYour numbers in sorted order...");

        for (int i = 0; i < size; i++)

            System.out.print(intList[i] + "  ");

        System.out.println ();

    }

}