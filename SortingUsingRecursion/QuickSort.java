import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 9, 5, 8, 0, 3, 1 };
        Arrays.sort(arr);
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Now my pivot is add to its correct index, so now add two halves

        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
