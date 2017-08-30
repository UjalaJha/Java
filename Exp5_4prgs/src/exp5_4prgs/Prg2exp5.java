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
public class Prg2exp5 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s;
        // TODO code application logic here
        
        
        
        int i,c=0,v=0,spc=0,d=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        s= sc.nextLine();
        
        int len=s.length();
        
         for(i=0;i<len;i++)   
         {
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
           v++;
           else if(s.charAt(i)==' ')
           spc++;
           else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
           d++;
           else 
           c++;
         } 
         
         int wrd=spc+1;
         System.out.println("No of words: "+wrd);
         System.out.println("No of space : "+spc);
         System.out.println("No of vowels : "+v);
         System.out.println("No of digits : "+d);
         System.out.println("No of consonant : "+c);
}
}
