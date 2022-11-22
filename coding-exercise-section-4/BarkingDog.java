public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Hour of day must be between 0 and 23");
            return false;
        } else if (barking == false) {
            System.out.println("Sweet dreams");
            return false;
        } else if (hourOfDay < 8 && barking == true) {
            System.out.println("The dog is barking at in the middle of the night");
            return true;
        } else if (hourOfDay > 22 && barking == true) {
            System.out.println("The dog is barking at in the middle of the night");
            return true;
        } else {
            return false;
        }
    }

}
