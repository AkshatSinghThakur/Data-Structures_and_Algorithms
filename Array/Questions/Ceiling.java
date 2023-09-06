import java.util.Arrays;

public class Ceiling {
    // Find the smallest number in the array that is greater than or equal to the
    // target element ?

    // Logic :- Find the target element and the number greater than tat target
    // element will be beside that taeget element.

    public static int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        if (array[start] < array[end]) { // ascending order array
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

            // return mid;
            return start;
            // If target element is not present in the array than the start index will be at
            // the ceiling number when the while loop condition is breaked, because if the
            // element is not present in the array than the target!=mid and the start and
            // end will cross each other and at this point start will be at the ceiling
            // number.

        } else if (array[start] > array[end]) { // descending order array
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < array[mid]) {
                    start = mid + 1;
                } else if (target > array[mid]) {
                    end = mid - 1;
                } else { // target == mid
                    return mid;
                }
            }

            return end;
            // return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println("Array :- " + Arrays.toString(array));

        int targetIndex = BinarySearch(array, 5);

        // System.out.println("Target element : " + array[targetIndex]);

        // Smallest element greater than the target element
        int start_index = 0;
        int end_index = array.length - 1;
        if (array[start_index] < array[end_index]) { // array in ascending order
            System.out.println("Smallest element greater than the target element : " + array[targetIndex + 1]);
        } else if (array[end_index] > array[start_index]) { // array in descending order
            System.out.println("Smallest element greater than the target element : " + array[targetIndex - 1]);
        } else {
            System.out.println("Smallest element greater than the target element is : " + array[targetIndex]);
            System.out.println("In this case the target element is not preset in the Array.");
        }

        // if (targetIndex == -1) {
        // System.out.println("Sorry! the element you are looking for is not present in
        // the Array. ");
        // } else {
        // System.out.println(array[targetIndex] + " is present at index at index " +
        // targetIndex);
        // }

        // This is the code which will give the ciling number if the target element is
        // present in the ARRAY.
        System.out.println();
    }
}
