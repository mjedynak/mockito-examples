package pl.mjedynak.mockito.legacy;

public class HardToTestClass {

    public Double calculateDiscount(String customerName, Integer amount) {
        Double discount = 0.0;
        if (amount > 10 || isImportantCustomer(customerName))  {
            discount = 25.0;
        }
        return discount;
    }

    boolean isImportantCustomer(String customerName) {
        return CustomerService.isImportantCustomer(customerName);
    }

    private static class CustomerService {
        public static boolean isImportantCustomer(String customerName) {
            return false;
        }
    }
}
