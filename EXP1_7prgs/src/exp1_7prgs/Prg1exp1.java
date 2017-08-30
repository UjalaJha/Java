/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp1_7prgs;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg1exp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter The number");
        a = sc.nextInt();
        if(a>=1&&a<=5)
            {
                System.out.println("No within The Range 1-5\n");
                switch(a)
                {
                    case 1:
                    System.out.println("Entered No is "+a);
                    break;
                    case 2:
                    System.out.println("Entered No is "+a);
                    break;
                    case 3:
                    System.out.println("Entered No is "+a);
                    break;
                    case 4:
                    System.out.println("Entered No is "+a);
                    break;
                    case 5:
                    System.out.println("Entered No is "+a);
                    break;
                }
            }
        else
            {
                System.out.println("No not within The Range 1-5\n");
            }  
                
       
    }
    
}
