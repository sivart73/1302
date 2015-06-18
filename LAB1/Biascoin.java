// Program Name			Biascoin.java
// Course					CSE1302J
// Name					   Travis Clement
// Assignment				Lab 1
// Due Date					5/20/2015
// Purpose					Class for flipping a biases coin

public class Biascoin 
{     
  public final int HEADS = 0;     
  public final int TAILS = 1;      
  private int face;   
  private double biasface;
  private double bias;
  // ---------------------------------------------     
//   Sets up the coin by flipping it initially.    
  // ---------------------------------------------    
  
    public Biascoin ()    
  {  
    bias = .5;
    flip();    
  }     
  public Biascoin (double bias)    
  {  
    this.bias = bias;
    flip();    
  }     

  // -----------------------------------------------    
  //   Flips the coin by randomly choosing a face with bias   
  // -----------------------------------------------     
 
  
    public void flip()    
  {  
    biasface =  Math.random();    
                 if (biasface < bias)
                   {
                   face = 0;
                 }
                 else 
                   {
                 face = 1;
                 }
  }  
  // -----------------------------------------------------    
  //   Returns the current face of the coin as an integer.    
  // -----------------------------------------------------     
  public int getFace()     
  {  return face;    
  }     
  // ----------------------------------------------------     
//   Returns the current face of the coin as a string.    
  // ----------------------------------------------------     
  public String toString()    
  {  
    String faceName;   
    if (face == HEADS)  
    {    
      faceName = "Heads";
    }
    else  
    {
      faceName = "Tails";  
    }
    return faceName; 
  } 
} 