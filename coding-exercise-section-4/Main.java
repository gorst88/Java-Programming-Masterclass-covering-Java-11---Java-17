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
        System.out.println("#---------- Equal Sum Checker ----------#");
        EqualSumChecker.hasEqualSum(1, 1, 1);
        EqualSumChecker.hasEqualSum(1, 1, 2);
        EqualSumChecker.hasEqualSum(1, -1, 0);
        // exercise 8
        System.out.println("#---------- Teen Number Checker ----------#");
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.isTeen(9);
        TeenNumberChecker.isTeen(13);
        // exercise 9
        System.out.println("#---------- Seconds and Minutes ----------#");
        SecondsAndMinutes.getDurationString(200, 30);
        SecondsAndMinutes.getDurationString(200, 300);
        SecondsAndMinutes.getDurationString(200, -1);
        SecondsAndMinutes.getDurationString(3000);
        SecondsAndMinutes.getDurationString(61, 0);
        // exercise 10
        System.out.println("#---------- Minutes to Years and Days ----------#");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        // exercise 11
        System.out.println("#---------- Int Equality Printer ----------#");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
        // exercise 12
        System.out.println("#---------- Is Cat Playing ----------#");
        PlayingCat.isCatPlaying(false, 45);

    }
}
