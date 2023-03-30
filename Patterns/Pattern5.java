public class Pattern5 {

    static void pattern5(int n) {
        for (int r = 0; r < 2 * n; r++) {
            int totalColsInRow = r > n ? 2 * n - r : r;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern5(9);
    }
}
