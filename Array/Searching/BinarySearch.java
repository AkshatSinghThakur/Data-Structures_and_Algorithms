import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearchMethod(int[] array, int target) {
        int start = 0;
        int end = (array.length - 1);

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index

            if (target < array[mid]) { // Target element in the left side of the array. So start will be fixed and end
                                       // will move.
                end = mid - 1;
            } else if (target > array[mid]) { // Target element in the right side of the array. So end will be fixed and
                                              // start will move.
                start = mid + 1;
            } else { // Target element is equals to the middle element.
                return array[mid];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Binary Search");
        System.out.println();

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Array :- " + Arrays.toString(array));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element you want to find in the given Array : ");
        int target = scanner.nextInt();

        if (BinarySearchMethod(array, target) == -1) {
            System.out.println();
            System.out.println("Sorry! this element is not present in the array");
        } else {
            System.out.println();
            System.out.println(BinarySearchMethod(array, target) + " is present in the Array.");
        }

        System.out.println();
        scanner.close();
    }
}
