// ****************************************************************
// FILE:  IntegerList.java
//
// Purpose: Define an IntegerList class with methods to create, fill,
//          sort, and search in a list of integers.
//          
// ****************************************************************
//testing if I can makes changes
import java.util.Scanner;

public class IntegerList
{
   int[] list; //values in the list

    //------------------------------------------------------------
    // Constructor -- takes an integer and creates a list of that
    // size.  All elements default to value 0.
    //------------------------------------------------------------
   public IntegerList(int size)
   {
      list = new int[size];
   }


    //------------------------------------------------------------
    // randomize -- fills the array with randomly generated integers 
    // between 1 and 100, inclusive
    //------------------------------------------------------------
   public void randomize()
   {
      int max = list.length;
      for (int i=0; i<list.length; i++)
      {
         list[i] = (int)(Math.random() * max) + 1;
      }
   }


    //------------------------------------------------------------
    // fillSorted -- fills the array with sorted values
    //------------------------------------------------------------
   public void fillSorted()
   {
      for (int i=0; i<list.length; i++)
      {
         list[i] = i + 2;
      }
   }


    //------------------------------------------------------------
    // print -- prints array elements with indices, one per line
    //------------------------------------------------------------
   public String toString()
   {
      String s = "";
      for (int i=0; i<list.length; i++)
      {
         s += i + ":\t" + list[i] + "\n";
      }
      return s;
   }


    //------------------------------------------------------------
    // linearSearch -- takes a target value and returns the index
    // of the first occurrence of target in the list.  Returns -1 
    // if target does not appear in the list
    //------------------------------------------------------------
   public int linearSearch(int target)
   {
      int location = -1;
      for (int i=0; i<list.length && location == -1; i++)
      {
         if (list[i] == target)
         {
            location = i;
         }
      }
      return location;
   }
   
   // -----------------------------------------------------
   //  Binary search of  array 
   //  array already sorted in ascending order
   // ----------------------------------------------------- 
      public int binarySearch (int target)
   {  
      int first = 0, middle, last = list.length - 1;        
      while (first <= last)   
      {      
         middle = (first + last)/2;      
         if (list[middle] == target)    
         {          
            return middle;    
         }      
         else if (list[middle] < target)    
         {
            first = middle + 1;    
         }
         else       
         {
            last = middle - 1;  
         }
      }   
      return -1;  
   } 


    
    //------------------------------------------------------------
    // sortIncreasing  -- uses selection sort
    //------------------------------------------------------------
   public void sortIncreasing()
   {
      for (int i=0; i<list.length-1; i++)
      {
         int minIndex = minIndex(list, i);
         swap(list, i, minIndex);
      }
   }
   
    //------------------------------------------------------------
    // sortDecreasing  -- uses insertion sort
    //------------------------------------------------------------
    public void sortDecreasing()
    
  {
    for (int index = 1; index < list.length; index++)
    {
      int key = list[index];
      int position = index;
      
      //  Shift larger values to the right
      while (position > 0 && list[position-1] < key)
      {
        list[position] = list[position - 1];
        position--;
      }
      
      list[position] = key;
    }
    }
    

    
    //------------------------------------------------------------
    // sortBubble  -- uses bubble sort
    //------------------------------------------------------------
   public void sortBubble()
   {
      int temp;
      boolean sorted;
      int numpairs = list.length-1;
      do
      {
         sorted = true;
      
         for (int i = 0; i < numpairs; ++i)
         {
            if (list[i] > list[i + 1])
            {         
            // Swap the values
               temp = list[i];
               list[i] = list[i + 1];
               list[i + 1] = temp;
               sorted = false;     
            }    
         }
         numpairs--;
      }
      while (sorted == false);
          
   
   }
   
   
   // swap values in array from given index numbers
   public static void swap (int[] alist, int aindex, int aminIndex)
   {
      int temp = alist[aminIndex];
      alist[aminIndex] = alist[aindex];
      alist[aindex] = temp;
    
    
   }
   
   
   //Determine the index of the minimum value
   public static int minIndex (int[] alist, int aindex)
   {
      int min = aindex;
      for (int scan = aindex+1; scan < alist.length; scan++)
      {
         if (alist[scan] < alist[min])
         {
            min = scan;
         }
         
      }
      return min;
   }

}