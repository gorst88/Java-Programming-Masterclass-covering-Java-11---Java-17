import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println(readUserInput());
    }

    public static String readUserInput() {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        do {
            System.out.println("Enter number # " + counter);
            String nextNumber = scanner.nextLine();
            try {
                sum += Integer.parseInt(nextNumber);
                counter++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Number");
            }

        } while (counter <= 5);

        scanner.close();
        return "The sum is " + sum;
    }
}
