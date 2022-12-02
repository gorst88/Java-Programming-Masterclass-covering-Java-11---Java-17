
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam
        // 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
        // Account account = new Account();

        // account.setPhone("12345");

        // account.deposit(1000);
        // account.withdraw(2001);
        // account.withdraw(1234);

        // Account timsAccount = new Account("Tim", "tim@email.com", "123456");
        // System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " +
        // timsAccount.getName());

        // Customer

        // Customer customer = new Customer("Tim", 1000, "tim@idiot.com");
        // System.out.println(customer.getName());
        // System.out.println(customer.getCreditLimit());
        // System.out.println(customer.getEmail());

        // Customer secondCustomer = new Customer();
        // System.out.println(secondCustomer.getName());
        // System.out.println(secondCustomer.getCreditLimit());
        // System.out.println(secondCustomer.getEmail());

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

        // Student

    }

}
