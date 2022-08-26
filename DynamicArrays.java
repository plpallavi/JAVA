import java.util.Scanner;
import java.util.Arrays;

public class DynamicArrays {
    // Arrays having no fixed size of coloumn and row
    public static void main(String args[]){
        int[][] arr={
                    {1, 2, 3, 4},
                    {4, 5},
                    {7, 8, 9}
                    };

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
}
