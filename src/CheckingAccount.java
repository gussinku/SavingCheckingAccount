/* Copyright © 2017 Oracle and/or its affiliates. All rights reserved. */

public class CheckingAccount {
    //Fields
    private String accountType = "checkingAccount";
    private String accountOwner =" Hanna Sinkala";
    private  double balance = 0.0;


    
    //Methods
    public  void printDetails(){
        System.out.println("AccountType " + accountType);
        System.out.println("AccountOwner " + accountOwner);
        System.out.println("Balance " + balance);

    }
    public void deposit(double x){
        if(x > 0){
            balance +=  x;
            System.out.println("deposited " + x );
            printDetails();
        }else{
             System.out.println("you can deposit negative amounts " + x);
              System.out.println("");
        }

    }
    public void withdraw(double x){
        if(x > 0 &&  (balance - x ) > 0){

            balance -= x;
             System.out.println("amount withdrawen " + x);
            printDetails();
        } else if(x < 0){
              System.out.println("Cannot withdraw negative amount: " +x);
              System.out.println("");
    } else if(balance-x <0){
         System.out.println("Cannot withdraw $" +x +" from $" +balance +" account");
        System.out.println("Balance cannot go negative.");
      System.out.println("");
    }
  }
}
