public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber *= 1000;
        secondNumber *= 1000;
        firstNumber = (int) firstNumber;
        secondNumber = (int) secondNumber;
        if (firstNumber == secondNumber) {
            System.out.println("Equal to the 3rd decimal point");
            return true;
        } else {
            System.out.println("Not equal to the 3rd decimal point");
            return false;
        }

    }
}
