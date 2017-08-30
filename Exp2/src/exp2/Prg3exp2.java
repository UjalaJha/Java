/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp2;

import java.util.Scanner;
import static java.lang.Math.pow;
/**
 *
 * @author prakash
 */
public class Prg3exp2 {
    
    public static void main(String []argh){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int t;
        t = sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                int sum=a;
                
                for(int j=0;j<n;j++)
                {
                    sum=(int) (sum+pow(2,j)*b);
                    System.out.print(sum+" ");
                }
                System.out.print("\n");
                
            }
        }
    }

//java loops
/*Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/
