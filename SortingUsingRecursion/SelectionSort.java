import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 9, 5 };
        selection(arr1, arr1.length, 0, 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void selection(int[] arr1, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr1[c] > arr1[max]) {
                selection(arr1, r, c + 1, c);
            } else {
                selection(arr1, r, c + 1, max);
            }
        } else {
            int temp = arr1[max];
            arr1[max] = arr1[r - 1];
            arr1[r - 1] = temp;
            selection(arr1, r - 1, 0, 0);
        }
    }
}
