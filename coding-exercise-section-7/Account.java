public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }

    public void deposit(double ammount) {
        balance += ammount;
        System.out.println(ammount + "$ deposited.");
        System.out.println("Current account balance is = " + balance);
    }

    public void withdraw(double ammount) {
        if (balance < ammount) {
            System.out.println("Not enough minerals.");
            System.out.println(
                    "Current account balance is = " + balance + ", and you wanted to withdraw " + ammount);
        } else {
            balance -= ammount;
            System.out.println(ammount + "$ withdrawn.");
            System.out.println("Current account balance is = " + balance);
        }
    }

    public String getNumber() {
        return this.number;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public double getAccountBalance() {
        return this.balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getName() {
        return this.customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getEmail() {
        return this.customerEmail;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public String getPhone() {
        return this.customerPhone;
    }

    public void setPhone(String string) {
        this.customerPhone = string;
    }

}
