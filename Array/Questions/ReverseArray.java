import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        System.out.println("Array :- " + Arrays.toString(array));

        int start = 0;
        int end = (array.length - 1);
        int temp = 0;

        while (start <= end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array :- " + Arrays.toString(array));
    }
}

// for (int i = 0; i <= (array.length / 2); i++) {
// for (int j = (array.length - 1); j >= (array.length / 2); j = j - 1) {
// temp = array[i];
// array[i] = array[j];
// array[j] = temp;
// }
// }
