public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(4);
    }

    public static int sumDigits(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        System.out.println(sumOfDigits);
        return sumOfDigits;
    }
}
