import java.util.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] array = { 8, -14, 10, 5, 3, 8, -2, 7, 0, 6, 1, -8, 14, 923234 };
        System.out.println("Array :- " + Arrays.toString(array));

        int minimum_number = array[0]; // assuming first element of the array to be the minimum.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum_number) { // comparing the first element value with the other elements of the array
                                             // anf if the value comes less than the assumed minimum value than updating
                                             // the value of the minimum number variable.
                minimum_number = array[i]; // updating value of minimum value variable.
            }
        }
        System.out.println("Minimum Number in the Array : " + minimum_number); // printig minimum number of the array.
    }
}

// Logic :- Assuming first element of the array to be the minumum an than
// omaring it with all the other elements in the array and updating the value of
// minimum number variable if the any element is less than the number which is
// assumed to be the minimum which is the first element of the array.