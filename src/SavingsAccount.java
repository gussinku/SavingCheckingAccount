/* Copyright © 2017 Oracle and/or its affiliates. All rights reserved. */

public class SavingsAccount {
    //Fields
    private String accountType = "Savings Account";
    private String accountOwner = "Kundananji Sinkala";
    private double balance = 0.0;
    private double interestRate = 0.02;
    
    
    //Methods
    public void printDetails(){
        System.out.println("Account Type: "  +accountType);
        System.out.println("Account Owner: " +accountOwner);
        System.out.println("Balance: $"      +balance);
        System.out.println("Interest Rate: " +interestRate);
        System.out.println("");
    }
    
    
    public void earnInterest(){
        balance = balance*(1+ interestRate/12);
        System.out.println("Interest: $" +balance*(interestRate/12));
        printDetails();
    }
    
    
    public void deposit(double x){
        if(x > 0){
            balance = balance + x;
            System.out.println("Deposit: $" +x);
            printDetails();
        }
        else{
            System.out.println("Cannot deposit negative amount: " +x);
            System.out.println("");
        }
    }
    
    
    public void withdraw(double x){
        if(x > 0 && (balance-x >0) ){
            balance = balance - x;
            System.out.println("Withdraw: $" +x);
            printDetails();
        }
        else if(x < 0){
            System.out.println("Cannot withdraw negative amount: " +x);
            System.out.println("");
        }
        else if(balance-x <0){
            System.out.println("Cannot withdraw $" +x +" from $" +balance +" account");
            System.out.println("Balance cannot go negative.");
            System.out.println("");
        }
    }
}
