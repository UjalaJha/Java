/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp2;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg2exp2 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int i;
        i = sc.nextInt();
        if(0==i%2)
        {
            if(i>=2&&i<=5)
                System.out.println("Not Weird");
            else if(i>=6&&i<=20)
                System.out.println("Weird");
            else if(i>=20)
                System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }
        
        
    }       
}
