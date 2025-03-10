package com.google;

class Account {
    private double balance;

    // Default constructor
    public Account() {
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account(); // Default constructor
        Account acc2 = new Account(1000); // Parameterized constructor

        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        acc2.deposit(1000);
        acc2.withdraw(500);
        acc2.displayBalance();
   }
}
