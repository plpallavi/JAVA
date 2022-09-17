import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 8, 6, 4, 3, 1, 9, 2 };
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}