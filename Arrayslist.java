import java.util.*;

class VOperation {
    int[] arr;

    void initilizer() {
        arr = new int[] { 11, 6, 77, 8, 5, 44, 6, 9, 442, 86, 73, 49, 68, 82 };
    }

    void linearSearch() {
        int flag = 0, temp = 0;
        Scanner num = new Scanner(System.in);
        int se = num.nextInt();
        for (int i = 0; i < arr.length; i++) {
            temp++;
            if (arr[i] == se) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("element found at " + temp);
        } else {
            System.out.println("Element not found");
        }

    }
public class Arrayslist {
    public static void main(String args[]) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

    }
}