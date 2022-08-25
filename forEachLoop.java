import java.util.Scanner;
public class forEachLoop {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the elemnets of array: ");
        int arr[] = new int[5];
        
        int i;
        for(i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Elements of array: ");
/* 
        for(int num : arr){ // for every element in array, print the element
            System.out.print(num + " "); //here num represents elemnt of the array
        }
        */
    // toString() Method

    
    }
}
