// Program Name   Strings.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 5
// Due Date       6/10/2015
// Purpose        Class for creating strings objects
//                and sorting them

// ******************************************************
//   Strings.java
//
//   Demonstrates insertionSort on an array of strings.
// ******************************************************

import java.util.Scanner;

public class Strings

{
    // --------------------------------------------
    //  Reads in an array of strings, sorts them,
    //  then prints them in sorted order.
    // --------------------------------------------

    public static void main (String[] args)
    {
        String[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        intList = new String[size];

        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.next();


        Sorting.bubbleSort(intList);
 
        System.out.println ("\nYour strings in sorted order...");

        for (int i = 0; i < size; i++)

            System.out.print(intList[i] + "  ");

        System.out.println ();

    }

}