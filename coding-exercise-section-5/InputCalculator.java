import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int loopCount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter any number, or a character to quit.");
            String nextNumber = scanner.nextLine();
            try {
                sum += Integer.parseInt(nextNumber);
                loopCount++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Number");
                break;
            }
        }
        scanner.close();
        if (loopCount > 0) {
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / loopCount));
        } else {
            System.out.println("No valid data was entered.");
        }
    }
}
