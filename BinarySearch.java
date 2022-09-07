public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.print(ans);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2; // might be possible the (start + end) excceds the
            // range of integr in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
