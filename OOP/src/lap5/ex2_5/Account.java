package lap5.ex2_5;

public class Account {
    private String id;
    private Customer customer;
    private double balance = 0.0;

    public Account(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(String id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount withdraw exceeds the current balance!");
        }
        return this;
    }

    public String toString() {
        return this.customer.toString() + " balance = $"
                + Math.round(this.balance * 100) / 100;
    }
}
