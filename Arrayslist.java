import java.util.*;

public class Arrayslist {
    public static void main(String args[]) {
        // Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(10); // adds new elements to the ArrayList
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.set(0, 00); // update an existing value for a specified index
        System.out.println(list);
        System.out.println(list.contains(20)); // returns true if list contains 20 and if list doesn't contain 20 it
                                               // returns false
        list.remove(2); // to remove an element from index
        System.out.println(list);
    }
}