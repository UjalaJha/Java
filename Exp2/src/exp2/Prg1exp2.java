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
public class Prg1exp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
                
        System.out.println("entered 3 numbers are");
        System.out.println(a+"\n"+b+"\n"+c);
        
        
    }
    
}
