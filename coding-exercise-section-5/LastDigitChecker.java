public class LastDigitChecker {

    public static void main(String[] args) {
        hasSameLastDigit(29, 99, 999);
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            return (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10);
        } else {
            return false;
        }
    }
}
