public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 23, 45, 67, 89 };
        int target = 45;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // Check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;

            }
        }
        return -1;
    }
}
