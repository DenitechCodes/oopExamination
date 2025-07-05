public class EFRISPolymorphismDemo {
    public static void main(String[] args) {
        TaxCategory[] categories = new TaxCategory[4];

        categories[0] = new Retailer();
        categories[1] = new Wholesaler();
        categories[2] = new Manufacturer();
        categories[3] = new Importer();

        double[] amounts = {100000, 150000, 120000, 130000};

        String[] types = {"Retailer", "Wholesaler", "Manufacturer", "Importer"};

        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(amounts[i]);
            System.out.println(types[i] + " VAT on " + amounts[i] + " = " + vat);
        }
    }
}
