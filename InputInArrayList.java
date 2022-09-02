import java.util.*;

public class InputInArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            List.add(in.nextInt());
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(List.get(i) + " "); // pass index here, list index [syntax] will not work here
        }

    }
}
