import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    // Order Agnostic Binary Search is simply a binary search only but before
    // applying the algorithim it checks wether the given array is in asscending
    // order or descending order.
    // It basicaly checks the order of the array and than applies/executes the
    // algorithim accordingly.

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
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Ceiling Problem
        // Find the smallest element in the array greater than the target element ?

        System.out.print("Enter the size of your array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at " + i + " index of Array : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array :- " + Arrays.toString(array));

        System.out.print("Enter the number you want to search in the Array : ");
        int target = scanner.nextInt();
        int ans = BinarySearch(array, target);

        if (ans == -1) {
            System.out.println("Sorry! the element you are looking for is not present in the provided Array.");
        } else {
            System.out.println("Element found in the array at index : " + ans);
        }

        scanner.close();
        System.out.println();
    }
}
