import java.util.Scanner;

public class LargestNumber {
    public static void main ( String arg[]){
        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the three number

        int max;
        max = a;

        if(b > max){
            max = b;
        }
        
        if(c > max){
            max = c;
        }

        System.out.print(max);
    }
    
}
