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

    
}
