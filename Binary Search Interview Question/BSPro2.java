// Floor of a number means biggest number in array smaller or equal to taregt
public class BSPro2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 9, 13, 15 };
        int target = 14;
        int ans = binarySearch(arr, target);
        System.out.print(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
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
        return end;
    }
}
