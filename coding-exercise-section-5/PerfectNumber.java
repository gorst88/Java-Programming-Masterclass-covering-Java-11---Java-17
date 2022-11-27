public class PerfectNumber {

    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sumOfDividors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sumOfDividors += i;
        }
        if (sumOfDividors == number) {
            System.out.println(number + " is a perfect number");
            return true;
        } else {
            System.out.println(number + " is not a perfect number");
            return false;
        }
    }
}
