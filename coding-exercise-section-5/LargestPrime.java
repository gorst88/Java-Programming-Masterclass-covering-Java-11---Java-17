public class LargestPrime {

    public static void main(String[] args) {
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    number /= divisor;
                    divisor--;
                }
            }
            return number;
        }
    }
}
