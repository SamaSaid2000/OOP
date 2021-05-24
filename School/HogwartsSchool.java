/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts.school;

import java.util.Scanner;

public class HogwartsSchool 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
      Gryffindor Harry_pooter=new Gryffindor ("Harry Games Pooter",170,"brouwn",20,"Bravery, helping others, and chivalry.","Gryffindor");
      
      Gryffindor Ron_Weasly=new Gryffindor ("Ronald Bilius Weasley",180,"orange",21,"Bravery, helping others, and chivalry.","Gryffindor");
      
      Gryffindor Hermione_Granger=new Gryffindor ("Hermione Jean Granger",160,"golden",20,"Bravery, helping others, and chivalry.","Gryffindor");

      Slytherin Draco_Malfoy=new Slytherin ("Draco Lucius Malfoy",165,"golden",21,"Ambition, cunningness, heritage, and resourcefulness.","Slytherin");
      
      Slytherin Lord_Voldemort=new Slytherin ("Tom_Riddel",185,"black",30,"Ambition, cunningness, heritage, and resourcefulness.","Slytherin");
      

       
       System.out.println("choose a num. from 1 to 5 to show information about one of Hogwarts` infuluencers");
       

        Scanner input=new Scanner(System.in);
        
        int choice=input.nextInt();
        

        switch(choice)
        {                                       
            case 1:System.out.println("name : "+Harry_pooter.name+"\n"+"age :"+"\t"+Harry_pooter.age+"\n"+"hight  "+Harry_pooter.hight+"cm"+"\n"+"hair color :"+Harry_pooter.hair_color+"\n"+"from "+Harry_pooter.house+"\n" +"House_characteristics :"+Harry_pooter.houses_characteristics );                                   
                break;
            case 2:System.out.println("name : "+Ron_Weasly.name+"\n"+"age :"+"\t"+Ron_Weasly.age+"\n"+"hight "+Ron_Weasly.hight+"cm"+"\n"+"hair color :"+Ron_Weasly.hair_color+"\n"+"from "+Ron_Weasly.house +"House_characteristics :"+Ron_Weasly.houses_characteristics);
                break;
            case 3:System.out.println("name : "+Hermione_Granger.name+"\n"+"age :"+"\t"+Hermione_Granger.age+"\n"+"hight  "+Hermione_Granger.hight+"cm"+"\n"+"hair color :"+Hermione_Granger.hair_color+"\n"+"from "+Hermione_Granger.house +"\n"+"House_characteristics :"+Hermione_Granger.houses_characteristics);
                break;
            case 4:System.out.println("name : "+Draco_Malfoy.name+"\n"+"age :"+"\t"+Draco_Malfoy.age+"\n"+"hight  "+Draco_Malfoy.hight+"cm"+"\n"+"hair color :"+Draco_Malfoy.hair_color+"\n"+"from "+Draco_Malfoy.house +"\n"+"House_characteristics :"+Draco_Malfoy.houses_characteristics);
                break;
            case 5:System.out.println("name : "+Lord_Voldemort.name+"\n"+"age :"+"\t"+Lord_Voldemort.age+"\n"+"hight  "+Lord_Voldemort.hight+"cm"+"\n"+"hair color :"+Lord_Voldemort.hair_color+"\n"+"from "+Lord_Voldemort.house +"\n"+"House_characteristics :"+Lord_Voldemort.houses_characteristics);
               break;
        }
        
    }
    
}
