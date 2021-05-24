/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumia;

/**
 *
 * @author sama
 */
public class Fashion {
    
    public Fashion (){}
    
    
  String color;
   int num_model ;
   int begining_of_price ;
   
   
  public Fashion ( String color, int num_model,  int p)
    {
      
        this.color=color;
        this.num_model=num_model;
      
        this.begining_of_price=p ;
    }
    
   
     String getColor()
     {
        return color;
     }
   int getnum_model()
   {
       return num_model ;
   }
    
   int getbegining_of_price()
   {
       return begining_of_price ;
   }
}
