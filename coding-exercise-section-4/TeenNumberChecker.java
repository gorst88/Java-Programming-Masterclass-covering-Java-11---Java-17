public class TeenNumberChecker {
    public static boolean hasTeen(int numOne, int numTwo, int numThree) {
        if (numOne >= 13 && numOne <= 19) {
            System.out.println("True");
            return true;
        } else if (numTwo >= 13 && numTwo <= 19) {
            System.out.println("True");
            return true;
        } else if (numThree >= 13 && numThree <= 19) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    public static boolean isTeen(int numOne) {
        if (numOne >= 13 && numOne <= 19) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }
}
