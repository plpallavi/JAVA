import java.util.Arrays;
import java.util.Scanner;
public class toStringMethod {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the elemnets of array: ");
/* 
        // Array of Primitives
        int arr[] = new int[5];

        int i;
        for(i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Elements of array: ");
        System.out.println(Arrays.toString(arr));*/

        // Array oof object
        String str[] = new String[4];
        for(int s=0; s<str.length; s++){
            str[s] = in.next();
        }
        System.out.println("Elements of array: ");
        System.out.println(Arrays.toString(str));
        

    }
}
