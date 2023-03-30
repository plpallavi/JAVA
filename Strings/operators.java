import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // ascii value of a is 97 and b is 98, so a+b =195.
        System.out.println("a" + "b"); // here two strings are added so the o/p is ab.
        System.out.println('a' + 3); // ascii value of a whicj 97 and 3 will be add so the o/p is 100
        System.out.println((char) ('a' + 3)); // converted into char
        System.out.println("a" + 2);
        // this is same as after a few steps:"a"+"1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());// intially arraylist is empty, then it is converted into kunal

        System.out.println("Kunal" + new Integer(78));
    }

}
