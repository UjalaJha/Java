/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp4_5prgs;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg2exp4 {
     public static void main(String[] args)
    {
        
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt()%26;
        
        int i,num=0;

        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            if((int)ch>=65&&(int)ch<=90)
            {
                num=(int)ch+k;
                if(num>90)
                {
                    num=64+num-90;
                    //System.out.print(num);
                }
                System.out.print((char)num);
            }
            
            
            else if((int)ch>=97&&(int)ch<=122)
            {
                num=(int)ch+k;
                if(num>122)
                {
                    num=96+num-122;
                    //System.out.print(num);
                }
                System.out.print((char)num);
            }
           
            else
                System.out.print(ch);
            
        
    }
}
}
/*Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb*/