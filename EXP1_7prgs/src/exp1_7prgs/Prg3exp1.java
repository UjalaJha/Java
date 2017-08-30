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
public class Prg3exp1 {
    public static void main(String[] args) {
     
       // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter The no to find its factors");
        
        a = sc.nextInt();
        System.out.println("The factors are : ");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            System.out.println(i);
        }  
        
    }
    
}
