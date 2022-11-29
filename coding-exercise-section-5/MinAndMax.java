import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;

        do {
            System.out.println("Enter any number, or a character to quit.");
            String nextNumber = scanner.nextLine();
            try {
                double number = Integer.parseInt(nextNumber);
                if (loopCount == 0 || min > number) {
                    min = number;
                }
                if (loopCount == 0 || max < number) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                System.out.println("Exiting program");
                break;
            }
        } while (true);
        scanner.close();
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data was entered");
        }
    }
}
