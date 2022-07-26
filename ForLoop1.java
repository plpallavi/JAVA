import java.util.Scanner;

public class ForLoop1 {
    // Print number from 1 to n
    public static void main(String args[]){

        Scanner input = new Scanner (System.in);

        int n;
        int num = input.nextInt();

        for(n=1; n<=num; n++){
            System.out.println(n);
        }

    }
}
