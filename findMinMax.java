public class findMinMax {
    public static void main(String[] args) {
        int[] arr = { 18, 34, 400, 65, 78, 98 };
        System.out.print("MinValue: ");
        System.out.println(min(arr));
        System.out.print("MaxValue: ");
        System.out.println(max(arr));
    }

    // Assume arr.length =0

    // return the min value in the array

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    // return the max value in the array

    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
