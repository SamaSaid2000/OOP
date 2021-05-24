/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumia;

import java.util.Scanner;

/**
 *
 * @author sama
 */
public class Jumia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      electronics Egyption_electronics =new electronics ("black",2010,"headPhone",500)  ;
      electronics abroad_electronics =new electronics ("red",2015,"headPhone",3000)  ;
    
      
    headPhones earbud=new headPhones() ;
      
      earbud.type="earbud";
      earbud.birthdate=2012;
      earbud.color="black";
      earbud.brand="apple";
      earbud.begining_of_price=2000;
      
    Dress mini=new Dress();
    
      mini.color="red" ;
      mini.begining_of_price=500;
      mini.num_model= 2019;
      mini.size=48;
      
    Dress long_dress=new Dress();
    
      long_dress.color="blue" ;
      long_dress.begining_of_price=800;
      long_dress.num_model=2020;
      long_dress.size=45;
    
    women_Fashion one_piece=new women_Fashion();
    
      one_piece.begining_of_price=200;
      one_piece.type="women_Fashion : dress";
      
    
     System.out.println("Welcome to Jumia Store");

    System.out.println("For Fashion press 1");
    System.out.println("For electronics press 2");
    
         Scanner input=new Scanner(System.in);
        
        int choice=input.nextInt();
        

        switch(choice)
        {                                       
            case 1:System.out.println( "welcome to Fashion Section "+"\n"+ "there are : "+ one_piece.type +"\n"+ "mini_dress Section :"
                    + " "+"\n" +"color : "+ mini.color +"\n"+ "number of model : "+  mini.num_model + "\n"+"Size: "+  mini.size +"\n" +
                    "begining of price is :" +  mini.begining_of_price  +"\n"+"long_dress Section : "+"\n" +"color : "+ long_dress.color+
                    "\n"+ "number of model : "+  long_dress.num_model + "\n"+"Size: "+  long_dress.size +"\n" + "begining of price is :" +
                    long_dress.begining_of_price +"\n"+ "thanks for using Jumia" ) ;
            
                break;
                
                case 2:System.out.println("welcome to electronics Section "+"\n"+ "there are many brands " +"\n"+ "type of Head Phones : "+
                        earbud.type +"\n"+ "brand is : "+ earbud.brand + "\n" + "color is : "+ earbud.color + "\n" + " price is : " +  earbud.begining_of_price +
                        "\n"+ "thanks for using Jumia" );
                
                break;
            
        }
      
   
       
       
      
        
    }
    
}
