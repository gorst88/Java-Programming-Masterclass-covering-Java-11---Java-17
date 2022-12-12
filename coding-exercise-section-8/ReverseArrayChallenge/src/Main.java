import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { 5, 6, 7, 8, 9, 1};
        System.out.println(Arrays.toString(intArray));
        reverse(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    public static int[] readIntegers(int count) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int findMin(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[0]);
        return arr[0];
    }

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0; i < array.length/2; i++){ // can use half length instead of array.length-1-i
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}

//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name eReverseArrayChallengef