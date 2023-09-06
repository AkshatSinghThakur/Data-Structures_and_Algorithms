import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Linear Search");
        System.out.println();

        // Creating Arrays
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[][] array2 = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };


        // Printing Arrays
        System.out.println("One Dimensional Array :- ");
        System.out.println(Arrays.toString(array1));

        System.out.println();

        System.out.println("Two Dimensional Array :- ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

        System.out.println();
    }
}
