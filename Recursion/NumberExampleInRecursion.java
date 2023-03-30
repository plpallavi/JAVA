public class NumberExampleInRecursion {
    public static void main(String[] args) {
        print(2);
    }

    static void print(int n) {
        if (n == 20) {
            System.out.println(20);
            return;
        }

        System.out.println(n);
        print(n + 2);
    }
}
