public class SalesPerson {
    private String id;
    private Sales[] salesHistory;

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[0];
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        Sales[] newSalesHistory = new Sales[salesHistory.length + 1];
        System.arraycopy(salesHistory, 0, newSalesHistory, 0, salesHistory.length);
        newSalesHistory[salesHistory.length] = s;
        salesHistory = newSalesHistory;
    }

    public int getCount() {
        return salesHistory.length;
    }

    public double calcTotalSales() {
        double total = 0;
        for (Sales sale : salesHistory) {
            total += sale.getValue() * sale.getQuantity();
        }
        return total;
    }

    public Sales largestSale() {
        if (salesHistory.length == 0) {
            return null;
        }
        Sales largestSale = salesHistory[0];
        for (int i = 1; i < salesHistory.length; i++) {
            if (salesHistory[i].getValue() > largestSale.getValue()) {
                largestSale = salesHistory[i];
            }
        }
        return largestSale;
    }
}
