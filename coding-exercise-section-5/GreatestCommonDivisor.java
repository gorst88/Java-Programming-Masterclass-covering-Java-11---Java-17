public class GreatestCommonDivisor {

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
        getGreatestCommonDivisor(12, 30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestDivisor = 0;
        if (first < 10 || second < 10)
            return -1;
        for (int i = 1; i <= (first / 2); i++) {
            if (first % i == 0 && second % i == 0)
                greatestDivisor = i;
        }
        System.out.println(greatestDivisor + " is the greatest common divisor.");
        return greatestDivisor;
    }
}
