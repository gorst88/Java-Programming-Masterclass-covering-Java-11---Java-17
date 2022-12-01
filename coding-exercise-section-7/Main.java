public class Main {

    public static void main(String[] args) {

        // Account account = new Account();

        // account.setPhone("12345");

        // account.deposit(1000);
        // account.withdraw(2001);
        // account.withdraw(1234);

        // Account timsAccount = new Account("Tim", "tim@email.com", "123456");
        // System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " +
        // timsAccount.getName());

        // Customer

        Customer customer = new Customer("Tim", 1000, "tim@idiot.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        // Car

        // Car car = new Car();
        // car.setMake("Maserati");
        // car.setModel("Carrerra");
        // car.setColor("Black");
        // car.setDoors(2);
        // car.setConvertible(true);
        // System.out.println("make = " + car.getMake());
        // System.out.println("model = " + car.getModel());
        // car.describeCar();

        // Car targa = new Car();
        // targa.setMake("Porsche");
        // targa.setModel("Targa");
        // targa.setColor("red");
        // targa.setDoors(2);
        // targa.setConvertible(false);
    }
}
