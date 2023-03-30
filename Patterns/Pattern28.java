public class Pattern28 {

    static void pattern28(int n) {
        for (int r = 1; r <= 2 * n; r++) {
            int totalcolInRow = r > n ? 2 * n - r : r;

            int noOfSpaces = n - totalcolInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int c = 0; c < totalcolInRow; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern28(5);
    }
}
