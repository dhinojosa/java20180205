package com.salesforce.gryffindor;

public class Account {
    private long balance;
    private final Object lock = new Object();

    public synchronized void deposit(long amount) {
        this.balance += amount;
    }

    public long withdrawal(long amount) {
        System.out.println("Just logging a withdrawal");
        synchronized (lock) {
            if (amount > this.balance) {
                long remaining = this.balance;
                this.balance = 0;
                return remaining;
            } else {
                this.balance -= amount;
                return amount;
            }
        }
    }
}
