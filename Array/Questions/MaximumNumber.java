import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println();
        // Find the number which has the maximum value in the given Array and also give
        // the index of that maximum value ?

        int[] array = { 432, 56, 23, 3123, 12, 575, 3456, 234, 2876 };
        int max = array[0];
        int min = array[0];
        int max_index = 0;
        int min_index = 0;

        System.out.println("Array :- " + Arrays.toString(array));
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                min_index = i;
            }
        }

        System.out.println("Maximum value in the given Array : " + max + " which is at the index " + max_index);
        System.out.println("Minimum value in the given Array : " + min + " which is at the index " + min_index);

        System.out.println();
    }
}

// Logic :- We have assumed the maximum value in the array to be 0, than we are
// itrating through each element of the array and if the element value is
// greater than the assumed maximum value the maximum value is updated. This
// maximum value is updated till we traverse through the whole array, since we
// get the maximum value in the array.
