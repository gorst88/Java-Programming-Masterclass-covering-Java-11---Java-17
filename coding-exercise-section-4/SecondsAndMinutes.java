public class SecondsAndMinutes {

    public static void getDurationString(int min, int sec) {
        if (min < 0 || sec < 0 || sec > 59) {
            System.out.println("Invalid value");
        } else {
            int hours = min / 60;
            int remainingMinutes = min % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = sec + "s";
            if (sec < 10) {
                secondsString = "0" + secondsString;
            }

            System.out.println(hoursString + minutesString + secondsString);
            // return hoursString + " " + minutesString + " " + secondsString;
        }
    }

    public static void getDurationString(int sec) {
        if (sec <= 0) {
            System.out.println("Invalid value");
        } else {
            int minutes = sec / 60;
            int remainingSeconds = sec % 60;
            getDurationString(minutes, remainingSeconds);
        }
    }
}
