import java.util.Arrays;

public class Demo {
    public static int BinarySearch(int[] array, int target) {
        int start = array[0];
        int end = (array.length - 1);

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else { // target == mid
                return mid;
            }
        }

        // return start;    // For Ceiling Number.
        // return mid;      // cannot return mid because it defined inside the while block.
        return end;         // or Floor Number.
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15 };
        int target = 8;

        int ans = BinarySearch(array, target);

        System.out.println();
        System.out.println("Array :- " + (Arrays.toString(array)));
        System.out.println("Target Element : " + target);
        // System.out.println("The target element is present at index : " + ans);
        // System.out.println("Ceiling number of the target element (" + target + ") is : " + array[ans]);
        System.out.println("Floor number of the target element (" + target + ") is : " + array[ans]);
        System.out.println();
    }
}
