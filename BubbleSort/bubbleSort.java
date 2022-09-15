import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 47, 87, 56, 41, 25, 36 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // foe each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the itme is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}