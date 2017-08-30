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
public class Prg3exp4 {
    
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int i;
        
       for (i=1;i<str.length();i++)
       {
            if (str.charAt(i)==str.charAt(i-1))
            {
                str=str.substring(0, i-1)+str.substring(i+1);
                i=0;
            }
        }
        if (str.length()==0) 
        {
            System.out.println("Empty String");
        } else 
        {
            System.out.println (str);
        }
        
}
}
/*
Sample Input 0

aaabccddd
Sample Output 0

abd
*/