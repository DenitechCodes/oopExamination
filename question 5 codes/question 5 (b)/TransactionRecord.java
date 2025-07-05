public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String transactionTimestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double amount, String timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = amount;
        this.transactionTimestamp = timestamp;
    }

    // Getters
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    // Setters
    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public void setTransactionTimestamp(String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}
