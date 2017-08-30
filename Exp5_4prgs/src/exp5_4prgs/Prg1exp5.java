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
public class Prg1exp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1,s2,sub;
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        s1= sc.nextLine();
        System.out.println("Enter the word whose occurence has to be found : ");
        s2= sc.nextLine();
       int  n1=s1.length();
       int n2=s2.length();
       int c=0;
       for(int i=0;i<=n1-n2;i++)
       {
           sub=s1.substring(i, i+n2);
           if(sub.compareTo(s2)==0)
           {
           c++;
           }
       }
        System.out.println("no of occurences is : "+c);
        
        
    }
    
}
