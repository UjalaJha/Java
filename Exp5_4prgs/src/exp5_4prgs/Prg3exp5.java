/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_4prgs;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg3exp5 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s,rev;
        // TODO code application logic here
        
        
        
        int j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        s= sc.nextLine();
        System.err.println("the entered string is "+s);
        System.err.println("the reverse string is ");
       int len=s.length();
        
         for(j=len-1;j>=0;j--)   
         {
            System.err.print(s.charAt(j));
         } 
        System.err.println("\n");
        
    }
}
