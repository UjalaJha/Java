/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp3_4prgs;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg4exp3 {
     public static void main(String[] args) 
    {
        Number N=new Number();
        Scanner sc=new Scanner(System.in);
        int c;
     do
        {
            System.out.println("------------MENU-----------"
                    + "\n 1 : factorial" 
                    + "\n 2 : reverse"
                    + "\n 3 : testArmstrong"
                    + "\n 4 : testPalindrome"
                    + "\n 5 : testPrime"
                    + "\n 6 : Fibonnaci"
                    + "\n------------------------------\n" );
           
           c=sc.nextInt();
           switch(c)
            {
                case 1:
                {
                    System.out.println("Enter a no to find its factorial");
                    int n=sc.nextInt();
                    N.factorial(n);
                    break;
                }
                                       
                case 2:
                {
                    System.out.println("Enter a no to find its reverse");
                    int n=sc.nextInt();
                    N.reverse(n);
                    break;
                }
                
                case 3:
                {
                    System.out.println("Enter a no to test armstrong");
                    int n=sc.nextInt();
                    N.testArmstrong(n);
                    break;
                }
                
                case 4:
                {
                    System.out.println("Enter a no to test palindrome");
                    int n=sc.nextInt();
                    N.testPalindrome(n);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter a no to test prime or not");
                    int n=sc.nextInt();
                    N.testPrime(n);
                    break;
                }
                
                case 6:
                {
                    System.out.println("Enter a no of terms to find fibonacci");
                    int n=sc.nextInt();
                    N.fibonacci(n);
                    break;
                }
                
                
            }
        }
        while(c!=0);

}
}