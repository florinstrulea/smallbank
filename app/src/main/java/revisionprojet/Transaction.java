package revisionprojet;

public class Transaction {
    //#region properties
    protected String transactionName;
    protected int transactionId;
    protected float transactionAmount;
    //#endregion properties

    //#region getters and setters
    public String getTransactionName() {
        return transactionName;
    }
    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public float getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    //#endregion

@Override
public String toString(){
   return "transactionAmount : " +transactionAmount+"transactionName : "+ transactionName  +"\n";
     
}
}
