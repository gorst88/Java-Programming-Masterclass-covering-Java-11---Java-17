public class GetEvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(245);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                sum += (digit % 2 == 0) ? digit : 0;
                number /= 10;
            }
            return sum;
        }
    }
}
