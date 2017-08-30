/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Banking_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers : ");
        int n=sc.nextInt();
        Customer s[]=new Customer[n];
       
        String t1, t2, t3, t4;
                
         sc.nextLine();
        int i, c;
       
        for(i=0; i<n; i++)
        {
            System.out.println("Enter your name : ");
            t1=sc.nextLine();
            System.out.println("Enter your account number: ");
            t2=sc.nextLine();
            System.out.println("Enter your contact number : ");
            t3=sc.nextLine();
            System.out.println("Enter your address : ");
            t4=sc.nextLine();
            s[i]=new Customer(t1, t2, t3, t4);
        }
        
        for(i=0; i<n; i++)
        {
            System.out.println("\n------------------------------------------\n");
            System.out.println("NAME : "+s[i].getName());
            System.out.println("ACCOUNT NUMBER : "+s[i].getAcc_no());
            System.out.println("CONTACT NUMBER : "+s[i].getContact_no());
            System.out.println("ADDRESS : "+s[i].getAddress());
        }
        
        do
        {
            System.out.println("------------MENU-----------"
                    + "\n 1 : Create Account"
                    + "\n 2 : Deposit"
                    + "\n 3 : Withdraw"
                    + "\n 4 : Compute interest"
                    + "\n 5 : Display balance"
                    + "------------------------------\n" );
           
            c=sc.nextInt();
           switch(c)
            {
                case 1:
                {
                    Customer b=new Customer();
                    b.create_acc();
                }
                                       
                case 2:
                {
                    System.out.println("Enter your account number : ");
                    sc.nextLine();
                    t2=sc.nextLine();
                    for(i=0; i<n; i++)
                    {
                        if(t2.equalsIgnoreCase(s[i].getAcc_no()))
                        {
                            System.out.println("Enter the amount to be deposited : ");
                            int am=sc.nextInt();
                            s[i].deposit(am);
                            s[i].display();
                        }
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.println("Enter your account number : ");
                    sc.nextLine();
                    t2=sc.nextLine();
                    for(i=0; i<n; i++)
                    {
                        if(t2.equalsIgnoreCase(s[i].getAcc_no()))
                        {
                            System.out.println("Enter the amount to be withdrawn : ");
                            int am=sc.nextInt();
                            s[i].withdraw(am);
                            s[i].display();
                        }
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.println("Enter your account number : ");
                    sc.nextLine();
                    t2=sc.nextLine();
                    for(i=0; i<n; i++)
                    {
                        if(t2.equalsIgnoreCase(s[i].getAcc_no()))
                        {
                            System.out.println("Enter the number of years : ");
                            int am=sc.nextInt();
                            s[i].compute_int(am);
                        }
                    }
                    break;
                }
                
                case 5:
                {
                    System.out.println("Enter your account number : ");
                    sc.nextLine();
                    t2=sc.nextLine();
                    for(i=0; i<n; i++)
                    {
                        if(t2.equalsIgnoreCase(s[i].getAcc_no()))
                        {
                            s[i].display();
                        }
                    }
                    break;
                }
                
                
                
                
            }
        }
        while(c!=0);
    }
    
}

    
    

