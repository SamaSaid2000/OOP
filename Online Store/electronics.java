/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumia;

import java.util.Date;

/**
 *
 * @author sama
 */
public class electronics {
    
   public electronics ()
   {
       
   }
   
   String color;
   int birthdate ;
  String type ;
   int begining_of_price ;
   
   
  public electronics ( String color,int birthdate, String type, int p)
    {
      
        this.color=color;
        this.birthdate=birthdate;
        this.type=type;
        this.begining_of_price=p ;
    }
    
  
  Date d=new Date();  
    int year=d.getYear()+1900;
        
    
    
    int getBirthdate(){
        return birthdate;
    }
    
    String getType(){
        return type;
    }
     String getColor()
     {
        return color;
     }
    int getAge(int birthdate){
        return year-birthdate;
    }
    
    
    
}
