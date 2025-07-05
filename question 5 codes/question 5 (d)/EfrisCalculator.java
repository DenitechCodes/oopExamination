public class EfrisCalculator {
    public static void main(String[] args) {
        TaxCategory[] categories = new TaxCategory[3];
        categories[0] = new Retailer();
        categories[1] = new Wholesaler();
        categories[2] = new Importer();

        double[] amounts = {2000, 5000, 80000};

        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(amounts[i]);
            System.out.println("Transaction Amount: " + amounts[i] +
                               " | VAT: " + vat);
        }
    }
}
