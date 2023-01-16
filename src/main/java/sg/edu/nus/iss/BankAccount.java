package sg.edu.nus.iss;

import java.util.*;

public class BankAccount {
    private String fullName;
    private final String accountNo;
    private double balance = 0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getAccountNo() {  return accountNo; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    public Date getAccountStartDate() { return accountStartDate; }
    public void setAccountStartDate(Date accountStartDate) { this.accountStartDate = accountStartDate; }

    public Date getAccountEndDate() { return accountEndDate; }
    public void setAccountEndDate(Date accountEndDate) { this.accountEndDate = accountEndDate; }

    public BankAccount(String fullName, String accountNo, double balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.fullName = fullName;
        this.accountNo = accountNo;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public BankAccount(String fullName, String accountNo, double balance) {
        this.fullName = fullName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void showAccount() {
        System.out.println(("Account No: " + accountNo));
        System.out.println(("Fullname: " + fullName));
        System.out.println("Balance: " + balance);;
    }

    @Override
    public String toString() {
        return "BankAccount [fullName=" + fullName + ", accountNo=" + accountNo + ", balance=" + balance + ", isActive="
                + isActive + "]";
    }

    public void deposit(double amount) {

        if (!isActive) {
            throw new IllegalArgumentException("You cannot make deposit to a closed account!");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("You cannot make negative deposit!");
        }
        else {
            balance += amount;
        }

    }

    public void withdraw(double amount) {

        if (!isActive) {
            throw new IllegalArgumentException("You cannot make withdrawal out a of closed account!");
        }

        if (balance < amount) {
            throw new IllegalArgumentException("Your balance is less than " + amount);
        }
        else {
            balance -= amount;
        }
    }
}
