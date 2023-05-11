public class Driver {
    public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson("SP001");
        System.out.println("Salesperson ID: " + salesPerson.getId());

        Sales sale1 = new Sales("Item001", 10.50, 2);
        Sales sale2 = new Sales("Item002", 5.25, 3);

        salesPerson.setSalesHistory(sale1);
        salesPerson.setSalesHistory(sale2);

        System.out.println("Number of sales: " + salesPerson.getCount());
        System.out.println("Total sales: " + salesPerson.calcTotalSales());
        System.out.println("Largest sale: " + salesPerson.largestSale().getItemId());
    }
}
