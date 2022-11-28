public class FlourPackProblem {

    public static void main(String[] args) {
        canPack(1, 0, 4);
        // canPack(1, 0, 5);
        // canPack(0, 5, 4);
        // canPack(2, 1, 5);
        // canPack(2, 2, 11);
        // canPack(-3, 2, 12);
    }

    // public static boolean canPack(int bigCount, int smallCount, int goal) {
    // if (bigCount < 0 || smallCount < 0 || goal < 0) {
    // return false;
    // } else {
    // bigCount *= 5;
    // int bigSum = bigCount;
    // if (bigSum <= goal && goal < 9 || goal % 5 == 0) {
    // goal -= bigSum;
    // if (smallCount >= goal) {
    // return true;
    // }
    // } else if (smallCount >= goal) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // return false;
    // }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }
}
