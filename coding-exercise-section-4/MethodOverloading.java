public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(200);
        calcFeetAndInchesToCentimeters(50, 10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeter = ((inches + feet * 12) * 2.54);
            System.out.println(feet + " feet and " + inches + " inches = " + centimeter + " centimeter.");
            return centimeter;
        }
        System.out.println("Invalid feet or inches parameters.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) (inches / 12);
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
