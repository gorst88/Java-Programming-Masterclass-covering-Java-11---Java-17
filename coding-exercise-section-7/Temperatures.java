import java.sql.Array;
import java.util.Arrays;

public class Temperatures {
    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        System.out.println(Arrays.toString(ts));
        System.out.println(ts.length);
        if (ts.length == 0)
            return 0;

        int test = ts[0];

        for (int i = 0; i < ts.length; i++) {
            int number = ts[i];
            int absNumber = Math.abs(number);
            int absTest = Math.abs(test);
            if (absNumber < absTest) {
                test = number;
            } else if (absNumber == absTest && test < 0) {
                test = number;
            }
        }

        return test;
    }
}
