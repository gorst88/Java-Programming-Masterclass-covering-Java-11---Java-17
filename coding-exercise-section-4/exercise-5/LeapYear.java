public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year > 1 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                    return true;
                }
            }
        }
        System.out.println(year + " is not a leap year");
        return false;
    }
}
