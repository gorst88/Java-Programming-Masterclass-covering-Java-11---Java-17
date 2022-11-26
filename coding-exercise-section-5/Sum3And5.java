public class Sum3And5 {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " is divisible by 3 and 5");
                counter++;
                sum += i;
            }
            if (counter == 3) {
                System.out.println("The sum = " + sum);
                break;
            }
        }
    }
}
