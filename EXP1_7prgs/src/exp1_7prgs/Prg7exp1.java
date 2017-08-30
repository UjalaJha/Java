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
public class Prg7exp1 {
    //Create variable for all primitive data types, get value from user using Scanner class
    //for all variables created and display it to the user.
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         int a,b;
         System.out.println("Enter the first number a : ");
         a = sc.nextInt();
         System.out.println("Enter the second number b : ");
         b = sc.nextInt();
         System.out.println("Addition = "+(a+b));
         System.out.println("Subtraction = "+(a-b));
         System.out.println("Multiplication = "+(a*b));
         System.out.println("Division = "+(a/b));
         System.out.println("Modulus of a, b = "+(a%b));

         boolean b1,b2;
         System.out.println("Enter firt boolean value a : ");
         b1 = sc.nextBoolean();
         System.out.println("Enter second boolean value b : ");
         b2 = sc.nextBoolean();
         System.out.println("Performing Logical Operations");
         System.out.println("a && b = " + (b1&&b2));
         System.out.println("a || b = " + (b1||b2) );
         System.out.println("!(a) = " + !(b1));
         System.out.println("!(b) = " + !(b2));
    }
    

}
