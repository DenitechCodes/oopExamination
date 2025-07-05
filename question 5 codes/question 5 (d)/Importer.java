public class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10; // 10% VAT
    }
}
