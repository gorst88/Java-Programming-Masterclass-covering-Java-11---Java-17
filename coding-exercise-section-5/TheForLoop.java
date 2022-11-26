public class TheForLoop {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = caluclateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest rate = " + interestAmount);
        }
    }

    public static double caluclateInterest(double amount, double interestRate) {

        return (amount * interestRate / 100);
    }
}