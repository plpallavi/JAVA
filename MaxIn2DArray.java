public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 },
                { 12, 13 }

        };
        System.out.println(max(arr));

    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];

                }
            }
        }
        return max;
    }
}
