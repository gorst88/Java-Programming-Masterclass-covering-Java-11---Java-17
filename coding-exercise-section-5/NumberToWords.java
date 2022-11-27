public class NumberToWords {

    public static void main(String[] args) {
        // numberToWords(4);
        // numberToWords(0);
        // numberToWords(100);
        // numberToWords(235);
        getDigitCount(-222);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        int reverseNumber = reverse(number);
        int digitDiference = getDigitCount(number) - getDigitCount(reverseNumber);
        do {
            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    break;
            }
            reverseNumber /= 10;
        } while (reverseNumber > 0);
        for (int i = 0; i < digitDiference; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (number % 10) + (reverseNumber * 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int digitCount = 0;
        do {
            digitCount++;
            number /= 10;
        } while (number != 0);
        return digitCount;
    }
}
