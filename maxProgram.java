public class maxProgram {
    public static void main(String args[]) {
        int arr[] = { 1, 20, 36, 45, 78 };
        System.out.println(max(arr));
        System.out.print(maxRange(arr, 1, 3));
    }

    // imagine that arary is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // to find max val in a range
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = 1; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
