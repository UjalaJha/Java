/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp3_4prgs;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Prg2exp3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c of quadratic ");
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        System.out.println("Entered quadratic equation is "+ a+"x*x"+"+"+b+"x"+"+"+c);
        float d=b*b-4*a*c;
        System.out.println(d);
        System.out.println(a);
        if(d<0)
        {
            System.out.println("no real soln");
        }
        else if(d>=0)
        {
            System.out.println(" real soln");
            if(d==0)
            {
                System.out.println("real and equal roots are "+(-b/(2*a)));
            }
            else
            {
                float r1 = (float) (-b+pow(d,0.5));
                
                    System.out.println("real and unequal root1 "+(r1/(2*a)));
                   
                float r2 = (float) (-b-pow(d,0.5));
                
                    System.out.println("real and unequal root1 "+(r2/(2*a)));
            }
        }
        
        
}
}