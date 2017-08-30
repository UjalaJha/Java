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
public class Prg1exp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        String s,rev="";
        
        s=sc.nextLine();
        int n=s.length();
        int i,c=0;
        for(i=0;i<n;i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                c++;     
            }
        } 
        System.out.println(c+1);
    } 
   
}
/*
Sample Input

saveChangesInTheEditor
Sample Output

5
*/
