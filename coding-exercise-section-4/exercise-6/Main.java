public class Main {
    public static void main(String[] args) {
        // exercise 1
        System.out.println("#--------- Positive Negative or Zero ----------#");
        PositiveNegativeZero.checkNumber(1);
        PositiveNegativeZero.checkNumber(-1);
        PositiveNegativeZero.checkNumber(0);
        // exercise 2
        System.out.println("#--------- Speed Converter ----------#");
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
        // exercise 3
        System.out.println("#--------- Mega Bytes Converter ----------#");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        // exercise 4
        System.out.println("#--------- Barking Dog ----------#");
        BarkingDog.shouldWakeUp(true, 1);
        BarkingDog.shouldWakeUp(false, 2);
        BarkingDog.shouldWakeUp(true, 8);
        BarkingDog.shouldWakeUp(true, -1);
        // exercise 5
        System.out.println("#---------- Leap Year ----------#");
        LeapYear.isLeapYear(-1600);
        LeapYear.isLeapYear(1600);
        LeapYear.isLeapYear(2017);
        LeapYear.isLeapYear(2000);
        LeapYear.isLeapYear(1924);
        // exercise 6
        System.out.println("#---------- Decimal Comparator ----------#");
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        // exercise 7
        EqualSumChecker.hasEqualSum(1, 1, 1);
        EqualSumChecker.hasEqualSum(1, 1, 2);
        EqualSumChecker.hasEqualSum(1, -1, 0);
        // exercise 8
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.isTeen(9);
        TeenNumberChecker.isTeen(13);
    }
}
