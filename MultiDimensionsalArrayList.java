import java.util.*;

public class MultiDimensionsalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // Add elments
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.print(list + " ");
    }
}
