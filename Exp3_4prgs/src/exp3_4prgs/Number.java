/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp3_4prgs;

/**
 *
 * @author prakash
 */
public class Number {
    void factorial(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
    void testPrime(int n)
    {
        int i,flag=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
            flag=1;
            break;
            }
        }
        if(flag==1)
            System.out.println("No is not prime");
        else
            System.out.println("No is prime");
    }
    void testArmstrong(int n)
    {
        int x=n;
        int arm=0,d;
        while(n!=0)
        {
            d=n%10;
            arm=arm+d*d*d;
            n=n/10;
        }
        if(x==arm)
            System.out.println("No is armstrong");
        else
            System.out.println("No is not armstrong");
    }
  void reverse(int n)
    {
        int x=n;
        int rev=0,d;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse of no is "+rev);
    }
  void testPalindrome(int n)
    {
        int x=n;
        int rev=0,d;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if ((rev-x)==0)
            System.out.println("No is palindrome");
        else
           System.out.println("No not is palindrome");
    }
  void fibonacci(int n)
    {
        int a=0,b=1,c;
           System.out.println(a);
           System.out.println(b);
        int i;
           for(i=1;i<=n-2;i++)
           {
               c=a+b;
               System.out.println(c);
               a=b;
               b=c;
           }
    }
}
