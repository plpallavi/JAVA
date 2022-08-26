import java.util.Scanner;
import java.util.Arrays;

public class Array2D {
    public static void main(String args[]){

        // Creating a 2-D Array

        int[][]num = {
                    {1, 2, 3},  // 0th index
                    {4, 5, 6}, // 1st index
                    {7, 8, 9} //c2nd index
        };
        System.out.println(num[1][0]);
        System.out.println(Arrays.toString(num[1]));
        System.out.println();
        

        //Taking input from user
        
        int[][] arr = new int[3][3];
        Scanner in = new Scanner (System.in);
        
        int row, col;
        for(row = 0; row < arr.length; row++ ){
            for(col = 0; col < arr[row].length; col++ ){
                arr[row][col] = in.nextInt();
            }
        }
        /*
        for(row = 0; row < arr.length; row++ ){
            for(col = 0; col < arr[row].length; col++ ){
                System.out.print(arr[row][col] + " "); // 1 2 3 4 5 6 7 8 9
            }
            System.out.println();
            //OUTPUT ---
            //1 2 3
            //4 5 6
            //7 8 9
        }
        */
        /* 
        //toString Method
        for(row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
*/
        // Enhanced For loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    
}
