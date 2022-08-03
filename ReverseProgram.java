// WAP to reverse the number
import java.util.Scanner;
public class ReverseProgram {
    public static void main (String ags[]){
        int num = 2486359;

        int ans = 0;

        while (num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans + 10 + rem;
        }
        System.out.println(ans);

    }
    
}