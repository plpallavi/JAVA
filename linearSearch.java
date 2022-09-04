public class linearSearch {
    public static void main(String[] args) {
        int[] nums = { 12, 45, 23, 5, 78, 97, 65 };
        int target = 12;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    // Search in the array: return the index if item found
    // Otherwise if item not found return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index
            int element = arr[index];
            if (element == target) {
                return index; // returns index of an elemesnt
                // return element; // return elemnts itself

            }
        }
        /*
         * Finding element through enhanced for loop
         * for(int elements : arr){
         * if (element == target){
         * return element
         * }
         * }
         */

        // This line will execute if none of the return statememts above have excuted
        // Hence the target not found
        return -1;
    }
}
