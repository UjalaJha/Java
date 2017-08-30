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
public class Prg5exp1 {
    public static void main(String[] args) {
     
       // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a no to check whether greater than 18 or not");
        a = sc.nextInt();
        if(a>=18)
        {
            
            System.out.println("value is greater than 18 ");
        }
        else 
        {
            System.out.println("Value less than 18 ");
           
        }
       
        
        System.out.println("\nenter a threshold value ");
        b = sc.nextInt();
        System.out.println("enter a no to check whether greater than threshold or not");
        c = sc.nextInt();
        if(c>=b)
        {
            
            System.out.println("value is greater than threshold ");
        }
        else 
        {
            System.out.println("value is less than threshold ");
        }
}
}
