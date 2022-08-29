package revisionprojet;

import java.util.Scanner;

import revisionprojet.interfaces.IAcount;

public class Account implements IAcount {
    Scanner scan = new Scanner(System.in);
    // #region properties
    protected float balance = 0f;
    protected float previousTransaction;
    protected String customerName;
    protected String customerId;
    // #endregion properties

    //

    // #region constructors

    public Account() {

    }

    public Account(String cName, String cId) {
        this.customerName = cName;
        this.customerId = cId;
    }

    public Account(float balance, float previousTransaction, String customerName, String customerId) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
        this.customerName = customerName;
        this.customerId = customerId;
    }
    // #endregion constructors

    // #region getters and setters

    // #endregion getters and setters

    // #region methods
    @Override
    public void checkBalance() {

    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(float previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public void makeDeposit(float amount) {
        if (amount > 0) {

        }
    }

    @Override
    public void makeWithdrawal(float amount) {
        // TODO Auto-generated method stub

    }

    @Override
    public void viewPrevioudTransaction() {
        // TODO Auto-generated method stub

    }

    @Override
    public void calculateInterest() {
        // TODO Auto-generated method stub

    }

    @Override
    public void exit() {
        // TODO Auto-generated method stub

    }
    // #endregion methods
    // scan.close();

}
