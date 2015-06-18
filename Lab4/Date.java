// Program Name   Date.java
// Course         CSE1302J
// Name           Travis Clement
// Assignment     Lab 4
// Due Date       6/1/2015
// Purpose        Class for date objects


public class Date
{
  private int month;
  private int day;
  private int year;
  
  
// ----------------------------------------------------
//   Default constructor
// ----------------------------------------------------
  public Date()
  {
    month = 0;
    day = 0;
    year = 0;
  }
  
// ----------------------------------------------------
//   constructor with parameters
// ----------------------------------------------------
  public Date(int amonth, int aday, int ayear)
  {
    month = amonth;
    day = aday;
    year = ayear;
  }
  
  
// ----------------------------------------------------
//   toString returns the all the information about date
// ----------------------------------------------------
  public String toString()
  {
    String dateinfo = month + "/" + day + "/" + year;
    
    return dateinfo;
  }
  
  
// ----------------------------------------------------
//   mehtod checks if dates are equal returns boolean true or false
// ----------------------------------------------------
  public boolean equals(Object o)
  {
    if (! (o instanceof Date))
    {
      return false;
    }
    
    Date objDate = (Date) o;
    if (month == objDate.month && day == objDate.day && year == objDate.year)
    {
      return true;
    }
    else
    {
      return false;
    }   
  }
}