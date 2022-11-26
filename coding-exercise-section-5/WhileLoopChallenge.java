public class WhileLoopChallenge {

    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int oddCount = 0;
        int evenCount = 0;
        while (start <= end && evenCount < 5) {
            start++;
            if (isEvenNumber(start)) {
                evenCount++;
                System.out.println(start);
            } else {
                oddCount++;
                continue;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
