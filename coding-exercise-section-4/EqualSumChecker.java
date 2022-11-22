public class EqualSumChecker {

    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        if ((numOne + numTwo) == numThree) {
            System.out.println(numOne + " + " + numTwo + " = " + numThree + " True");
            return true;
        } else {
            System.out.println(numOne + " + " + numTwo + " != " + numThree + " False");
            return false;
        }

    }

}
