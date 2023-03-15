package lap5.ex2_4;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer);

        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("id is: " + customer.getId());
        System.out.println("name is: " + customer.getName());
        System.out.println("discount is: " + customer.getDiscount());

        Invoice inv1 = new Invoice(101, customer, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());

        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerID());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}
