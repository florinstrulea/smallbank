package revisionprojet.interfaces;

public interface IAcount {
    // Check balance
    public void checkBalance();

    // Make a deposit

    public void makeDeposit(float amount);

    // make a withdrawal

    public void makeWithdrawal(float amount);

    // view previous transaction

    public void viewPrevioudTransaction();

    // calculate interest

    public void calculateInterest();

    // exit

    public void exit();
}
