package revisionprojet;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import revisionprojet.interfaces.IAcount;

public class Account {
    Scanner scan = new Scanner(System.in);
    // #region properties
    protected float balance = 0f;
    protected long accountId;
    protected String accountName;
    protected ArrayList<Transaction> transactions= new ArrayList();
    
    // #endregion properties

    //

    // #region constructors

    public Account() {

    }

    // #endregion constructors

    // #region getters and setters

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    // #endregion getters and setters

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    // #region methods
    //@Override
    public void checkBalance() {
    System.out.println("==============================");
    System.out.println(this.getBalance() + " euros");
    System.out.println("==============================");
    }   

    //@Override
    public void makeDeposit(Scanner scan) {
        System.out.println("==============================");
        System.out.println("Quelle est la somme que vous deposez");
        System.out.println("==============================");
       
        float amount = scan.nextFloat();
        // System.out.println("==============================");
        // System.out.println("Pour quel raison effectuez vous cette transaction");
        // System.out.println("==============================");
        // String reason = scan.next();
        if (amount > 0) {      
            this.setBalance(this.getBalance()+amount);
            this.checkBalance();
            Transaction transaction= new Transaction();
            transaction.setTransactionAmount(amount);
            transaction.setTransactionName("Transaction");
            //transaction.setTransactionId(this.getTransactions().get(this.getTransactions().size()-1).getTransactionId()+1); 
            transactions.add(transaction);
        } else {
            System.out.println("==============================");
            System.out.println("Vous devez une valeur positive");
            System.out.println("==============================");
        }
    }

    //@Override
    public void makeWithdrawal(float amount) {
        if (amount > 0) {
            this.setBalance(this.getBalance()-amount);
            this.checkBalance();

        } else {
            System.out.println("==============================");
            System.out.println("Vous devez une valeur positive");
            System.out.println("==============================");
        }
    }

    //@Override
    public void view10Transactions() {
        ArrayList<Transaction>lastTen=new ArrayList<>();
       for(int i=transactions.size()-1; i>=10; i--){
        lastTen.add(transactions.get(i));
       }
       
       System.out.println(transactions.stream().collect(Collectors.toList()));

    }

    //@Override
    public void calculateInterest() {
        // TODO Auto-generated method stub

    }

    //@Override
    public void exit() {
        // TODO Auto-generated method stub

    }
    // #endregion methods
    // scan.close();

}
