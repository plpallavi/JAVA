import java.util.Scanner;

public class ReturnValue {
    public static void main(String args[]){
        int ans = sum();
        System.out.println(ans);
    }

    // rteurn the value

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
    
}
