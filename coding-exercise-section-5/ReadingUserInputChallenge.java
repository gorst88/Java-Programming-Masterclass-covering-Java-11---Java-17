import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println(readUserInput());
    }

    public static String readUserInput() {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        boolean fiveValidNumbers = false;

        do {
            System.out.println("Enter number # " + counter);
            try {
                sum += checkNum(scanner.nextLine());
                fiveValidNumbers = counter < 5 ? false : true;
                counter++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }

        } while (!fiveValidNumbers);

        scanner.close();
        return "The sum is " + sum;
    }

    public static int checkNum(String number) {

        int num = Integer.parseInt(number);

        return num;
    }
}
