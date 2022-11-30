public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        

        account.setPhone("12345");

        account.deposit(1000);
        account.withdraw(2001);
        account.withdraw(1234);

        Account timsAccount = new Account("Tim", "tim@email.com", "123456");
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " +timsAccount.getName());
    }
}
