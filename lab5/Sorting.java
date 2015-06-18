
// Program Name   Sorting.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 5
// Due Date       6/10/2015
// Purpose        Class for sorting objects 
//                


//*******************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting
  
{
  
  //-----------------------------------------------------------------
  //  Sorts the specified array of objects using the selection
  //  sort algorithm.
  //-----------------------------------------------------------------
  
  public static void selectionSort (Comparable[] list)
    
  {
    int min;
    Comparable temp;
    
    for (int index = 0; index < list.length-1; index++)
    {
      min = index;
      for (int scan = index+1; scan < list.length; scan++)
      {
        if (list[scan].compareTo(list[min]) < 0)
        {
          min = scan;
          
          // Swap the values
          
          temp = list[min];
          list[min] = list[index];
          list[index] = temp;
        }
      }
    }
  }
  
  
  //-----------------------------------------------------------------
  //  Sorts the specified array of objects using the insertion
  //  sort algorithm.
  //-----------------------------------------------------------------
  
  public static void insertionSort (Comparable[] list)
    
  {
    for (int index = 1; index < list.length; index++)
    {
      Comparable key = list[index];
      int position = index;
      
      //  Shift larger values to the right
      while (position > 0 && key.compareTo(list[position-1]) > 0)
      {
        list[position] = list[position-1];
        position--;
      }
      
      list[position] = key;
    }
    
  }
  
  
  public static void bubbleSort (Comparable[] list)
    
  {
    int min;
    Comparable temp;
    boolean swapmade = true;
    
    for (int outer = list.length - 1; (outer > 1) ; outer--)
    {
      while (swapmade)
      {
        swapmade = false;
        for (int inner = 0; inner < outer; inner++)
        {
          if (list[inner].compareTo(list[inner + 1]) > 0)
          {         
            // Swap the values
            
            temp = list[inner];
            list[inner] = list[inner + 1];
            list[inner + 1] = temp;
            swapmade = true;
            
          }
          
        }
      }
    }
  }
}


