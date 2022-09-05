public class Leetcode2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

    }

    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // When you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            // Now we have sum oof accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }

}
