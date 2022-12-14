public class Switch {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charSwitchValue = 'A';

        switch (charSwitchValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charSwitchValue + " was found");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "jAnuAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "november":
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
