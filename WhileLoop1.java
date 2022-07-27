import java.util.Scanner;
// Print number from 1 to n

public class WhileLoop1{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        int n=1;
        int num = input.nextInt();

        while(n<=num){
            System.out.println(n);
            n++;
        }
    }

}