public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOfOddNumbers = 0;
        if ((end >= start) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOddNumbers += i;
                }
            }
        } else {
            System.out.println("Invalid Value");
            return -1;
        }
        System.out.println(sumOfOddNumbers);
        return sumOfOddNumbers;
    }
}
