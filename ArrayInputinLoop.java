import java.util.Scanner;
public class ArrayInputinLoop {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the Array length: ");

        //int[]array = new int[6];
        //System.out.println("Enter the elements of array: ");
        int length = sc.nextInt();
        int[]array = new int[5];
        //System.out.println("Enter the elements of array: ");

        //Input using for Loop
        int i;
        for(i=0; i<length-1; i++);{
            array[i] = sc.nextInt();
        }
        //System.out.println("Elemnts of Arrays are: ");

        for(i = 0; i<length-1; i++){
           //22 System.out.println("Elemnts of Arrays are: ");
        System.out.print(array[i] + " ");
        
        }
    }
}
