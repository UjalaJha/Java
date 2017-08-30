/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp4_5prgs;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg4exp4 {
    public static void main(String args[] ) throws Exception
    {
  
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        //System.out.println(s);
        int n=s.length();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<=96||s.charAt(i)>=123)
            {
                 s = s.substring(0, i) + s.substring(i+1);
                 i=0;
            }
        }
        
         char[] arr = s.toCharArray();
         Arrays.sort(arr);
         String sort = new String(arr);
         //System.out.println(sort);
         
         for (int i=1;i<sort.length();i++)
        {
            if (sort.charAt(i)==sort.charAt(i-1))
            {
                sort=sort.substring(0, i)+sort.substring(i+1);
                i=0;
            }
        }
        // System.out.println(sort);
        if(sort.length()==26) 
            System.out.println("pangram"); 
        else 
            System.out.println("not pangram");
        
            
    }
}

/*Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram
*/