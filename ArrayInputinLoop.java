import java.util.Scanner;
public class ArrayInputinLoop{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the elemnets of array: ");
        int arr[] = new int[5];
        
        int i;
        for(i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Elements of array: ");

        for(i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}