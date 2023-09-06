import java.util.Scanner;

public class FindElement {

    public static int ElementFinder(int targetElement, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Find the target element in the given Array.

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Scanner scanner = new Scanner(System.in);

        System.out.println( );
        System.out.print("Enter the element you want to find in the Array : ");
        int target = scanner.nextInt();

        System.out.println();
        int answer = ElementFinder(target, array);
        if (answer == -1) {
            System.out.println("Sorry " + target + " is not present in the given Array.");
        } else {
            System.out.println("Yes! " + target + " is present in the given Array at index " + answer);
        }
        System.out.println();

        scanner.close();
    }
}
