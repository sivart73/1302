// Program Name   PollArray.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Project 2
// Due Date       6/15/2015
// Purpose        This is for creating array from an opinion poll
// Purpose        Then printing out the results of the poll


import java.util.Scanner;
import java.io.*;
public class PollArray
{
  
  public static void main (String[] args) throws IOException    
  { 
    int[][][] poll = new int[4][3][2];
    Scanner in = new Scanner (new File("input.txt"));
    
    // initialing variables to something outside range
    int age = 10;
    int sex = 10;
    int opinion = 10;
    
    // variable to count the number of incorrect responses
    int incorrect = 0;
    
    // While loop to go through the text file and count all the responses
    // Loop stops with sentinel 9 9 9 
    while (age != 9 && sex != 9 && opinion != 9)
    {
      sex = in.nextInt();
      age  = in.nextInt();
      opinion = in.nextInt();
      
      // verify that input is good using checkResponse method
      boolean goodresponse = checkResponse(sex, age, opinion);
      
      //Add good repsonses to the array 
      if (goodresponse)
      {
        poll[age][opinion][sex]++;
      }
      else if (age != 9 && sex != 9 && opinion != 9)
      {
        // add to the incorrect responses
        incorrect++;
      }
      
    }
    // print out total number of yes no and undecided responses
    // using the printAll method
    printAll(poll);
    
    
    // Print out all the opinion responses for all males 
    System.out.println("ANSWER BY MALES");
    countBySex(poll,0);
    System.out.println();
    
    // Print out all the opinion responses for all females 
    System.out.println("ANSWER BY FEMALES");
    countBySex(poll,1);
    
    System.out.println();
    
    // Print out poll results by age and sex 
    System.out.println("__________________________________________");
    System.out.println("AGE\tYES\tNO\tUNDECIDED");
    System.out.println("__________________________________________");
    System.out.println("Males");
    System.out.println("18-24" + countByAgeSex(poll,0,0));
    System.out.println("25-30"  + countByAgeSex(poll,1,0));
    System.out.println("31-40"  + countByAgeSex(poll,2,0));
    System.out.println("Over 40"  + countByAgeSex(poll,3,0));
    System.out.println();
    System.out.println("Females");
    System.out.println("18-24" + countByAgeSex(poll,0,1));
    System.out.println("25-30"  + countByAgeSex(poll,1,1));
    System.out.println("31-40" + countByAgeSex(poll,2,1));
    System.out.println("Over 40" + countByAgeSex(poll,3,1));
    System.out.println();
    
    System.out.println("Incorrect Responses: " + incorrect); 
    System.out.println("Coded by Travis Clement");
  }

  public static boolean checkResponse(int asex, int anage, int anopinion)
  {
    if ((asex == 0 || asex == 1) && (anage >= 0 && anage <= 3) 
          && (anopinion >= 0 && anopinion <= 2))
    {
      return true;
    }
    return false;
  }

  // Method to print the opinion info for all people who responsed 
  public static void printAll(int[][][] poll)
  {
    int yes = 0;
    int no = 0;
    int undecided = 0;
    for (int i = 0 ; i < 4; i++)
    {
      for (int j = 0; j < 2 ; j++)
      {
        yes += poll [i] [0] [j];
        no += poll [i] [1] [j];
        undecided += poll [i] [2] [j];
      }
    }
    System.out.println("ALL RESPONSES");
    System.out.println("Yes " + yes + "\tNO " + no + "\tUndecided " + undecided);
    System.out.println();
  }
  
 // Method to give info by sex for opinions 
  public static void countBySex(int[][][] poll,int asex)
  {
    int yes = 0;
    int no = 0;
    int undecided = 0;
    for (int age = 0 ; age < 4; age++)
    {
      yes += poll [age] [0] [asex];
      no += poll [age] [1] [asex];
      undecided += poll [age] [2] [asex];
    }
    System.out.println("Yes " + yes + "\tNO " + no + "\tUndecided " + undecided);
    System.out.println();
  }

  // Method to count opinion response by age and sex 
  public static String countByAgeSex(int[][][] poll, int anage, int asex)
  {
    int yes = 0;
    int no = 0;
    int undecided = 0;
    yes += poll [anage] [0] [asex];
    no += poll [anage] [1] [asex];
    undecided += poll [anage] [2] [asex];
    String agecount = "\t" + yes + "\t " + no + "\t" + undecided;
    return agecount;
    
  }
}


     
     


