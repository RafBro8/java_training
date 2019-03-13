package com.alpha.classes_constructors_inheritance.Class;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


//with using Constructor
    public BankAccount() {

        //this is calling another Constructor within this Constructor
        this("5678", 5.00, "default name", "default email", "default phone");
        System.out.println("Empty Constructor called");
    }

//can have multiple Constructors, overloading Constructors(by changing number of Params)
    public BankAccount(String accountNumber, double balance, String customerName, String emailAddress, String phoneNumber) {
        System.out.println("Bank Account Constructor with Parameters called");

        //setting Field values in a Constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " has been made. New balance is " + this.balance);

    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}


//CHALLENGE
//create a new class which is going to be used for bank account +
//fields for the class will be the account number, the balance,
//customer name, email address, phone number +
//create getters and setters for each +
//And in addition create two additional methods for this class. +
//The first method should allow the customer to deposit funds. +
//So that method should then increment the balance field with the amount. +
//But also you should allow the customer to withdraw funds with another method. +
//And that method should deduct from the balance field but
//also not allow the withdrawal to complete if there are insufficient funds, and
//create various code in the main class, just to confirm that your code is working. +
//Add some system out print lines to the two +


//NO CONSTRUCTOR
//package com.alpha.classes_constructors_inheritance.Class;
//
//public class BankAccount {
//
//    private String accountNumber;
//    private double balance;
//    private String customerName;
//    private String emailAddress;
//    private String phoneNumber;
//
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void depositFunds(double depositAmount) {
//        this.balance += depositAmount;
//        System.out.println("Deposit of " + depositAmount + " has been made. New balance is " + this.balance);
//
//    }
//
//    public void withdrawFunds(double withdrawalAmount) {
//        if (this.balance - withdrawalAmount < 0) {
//            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
//        } else {
//            this.balance -= withdrawalAmount;
//            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
//        }
//    }
//}
