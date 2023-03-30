public class FiboUsingGoldenRatio {

    static int fiboFormula(int n) {
        // return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 -
        // Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
        // JUst for demo use long instead of int
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        // for (int i = 0; i < 50; i++) {
        // System.out.println(fiboFormula(i));
        // }

        System.out.println(fiboFormula(50));
    }
}
