import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = { 18, -14, 10, 5, 3, 8, -2, 7, 0, 6, 1, 3, 8, 14, 923234 };
        System.out.println(" Array :- " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (i == j) { // skippikng the itration when the value is checked with itself only.
                        continue;
                    } else {
                        System.out.println(
                                "Array contains duplicate number which is " + array[j] + " which is at index " + j);
                    }
                }
            }
        }
    }
}
