import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values.\r");
        int[] values = new int[capacity];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

//    public static int sortIntegers(int[] arr, int x) {
//        for (int i = 1; i < x; i++){
//            int j = i;
//            int y = arr[i];
//            while ((j > 0) && (arr[j-1] > y)){
//                arr[j] = arr[j-1];
//                j--;
//            }
//            arr[j] = y;
//        }
//
//
//    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
            sortedArray[i] = array [i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}