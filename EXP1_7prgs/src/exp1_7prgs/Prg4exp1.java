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
public class Prg4exp1 {
    public static void main(String[] args) {
     
       // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter The nos to find all no between them");
        
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The nos are : ");
        for(int i=a;i<=b;i++)
        {
            
            System.out.println(i);
        }  
        
    }
}
