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
public class Customer {
     String name, acc_no, contact_no, address;
    int bal=0;
    int roi=4;

    public Customer(String name, String acc_no, String contact_no, String address) 
    {
        this.name = name;
        this.acc_no = acc_no;
        this.contact_no = contact_no;
        this.address = address;
    }
  public Customer() 
    {
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBal() {
        return bal;
    }
    
    

    public void setBal(int bal) {
        this.bal = bal;
    }
    
    void deposit(int am)
    {
        bal=bal+am;
        System.out.println("The amount is deposited.");
    }
    
     void compute_int(int n)
    {
        int i;
        i=(bal*roi*n)/100;
        System.out.println("The interest is : "+i);
    }
     
    void withdraw(int am)
    {
        if(bal<am)
            System.out.println("Your account does not have enough balance.");
        else
        {
             bal=bal-am;
        System.out.println("The amount is withdrawn.");
        }
    }
     void display()
    {
        System.out.println("The amount present in your account is : "+bal);
    }
    
     void create_acc()
     {
         Scanner sc=new Scanner(System.in);
         sc.nextLine();
         System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your account number: ");
        acc_no=sc.nextLine();
        System.out.println("Enter your contact number : ");
        contact_no=sc.nextLine();
        System.out.println("Enter your address : ");
        address=sc.nextLine();
     }
}


