package Assignment1;

import java.util.Arrays;

public class Assignment1Q15 {
    public static void main(String[] args) {
        return;
    }

    private static int secondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
