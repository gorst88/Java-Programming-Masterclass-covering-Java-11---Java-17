
public class ArrayContains {
    int[] ints = { -9, 14, 37, 102 };

    static boolean exists(int[] ints, int k) {
        return binarySearch(ints, k) >= 0;
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            return -1;
        }
        return -1;
    }
}
