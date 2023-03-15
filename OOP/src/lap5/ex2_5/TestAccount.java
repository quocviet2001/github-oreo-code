package lap5.ex2_5;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Tan Ah Teck", 'm');
        System.out.println(customer1);
        Customer customer2 = new Customer(102, "Paul Tan", 'm');
        System.out.println(customer2);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account = new Account("A101", customer1, 10000);
        System.out.println(account);
        Account a2 = new Account("A102", customer2);
        System.out.println(a2);

        System.out.println("ID: " + account.getID());
        System.out.println("Customer: " + account.getCustomer());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer name: " + account.getCustomerName());
        account.setBalance(5000);
        System.out.println(account);
        account.deposit(500);
        System.out.println(account);
        account.withdraw(3500);
        System.out.println(account);
    }
}
