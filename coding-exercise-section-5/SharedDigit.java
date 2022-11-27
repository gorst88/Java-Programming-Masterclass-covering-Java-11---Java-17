public class SharedDigit {

    public static void main(String[] args) {
        hasSharedDigit(12, 35);
    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        } else {
            return (x / 10 == y / 10 || x / 10 == y % 10 || x % 10 == y / 10 || x % 10 == y % 10);
            // || secondDigitOfX == secondDigitOfY)
            // int firstDigitOfX = x / 10;
            // int secondDigitOfX = x % 10;
            // int firstDigitOfY = y / 10;
            // int secondDigitOfY = y % 10;
            // if (firstDigitOfX == firstDigitOfY || firstDigitOfX == secondDigitOfY ||
            // secondDigitOfX == firstDigitOfY
            // || secondDigitOfX == secondDigitOfY) {
            // return true;
            // } else {
            // return false;
            // }
        }
    }
}
