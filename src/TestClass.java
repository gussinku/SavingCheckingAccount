import .CheckingAccount;

/* Copyright © 2017 Oracle and/or its affiliates. All rights reserved. */

public class TestClass {
    public static void main(String[] args) {
    
    //Create new instance
    SavingsAccount savings1 = new SavingsAccount();
    
    //Call methods on instance
    /*savings1.printDetails();
    savings1.deposit(5000);
    savings1.withdraw(100);
    savings1.earnInterest();
    savings1.earnInterest();
    */
    
    //Create new instance
    CheckingAccount checking1 = new CheckingAccount();
    
    //Call methods on instance

        checking1.printDetails();
        checking1.deposit(20000);
        checking1.withdraw((40000));
        checking1.deposit(30000);
        checking1.printDetails();
        checking1.withdraw(40000);

        System.out.println("THis is a basic banking software ever");
    
    
    
    
    
    
    
    }
}
