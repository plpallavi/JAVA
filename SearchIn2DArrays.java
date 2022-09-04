import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 },
                { 12, 13 }

        };

        int target = 2;
        int[] ans = search(arr, target); // formate of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] { r, c };

                }
            }
        }
        return new int[] { -1, -1 };
    }
}
