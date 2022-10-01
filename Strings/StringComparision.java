public class StringComparision {
    public static void main(String[] args) {
        String a = "Pallavi";
        String b = "Pallavi";
        System.out.println(a);
        System.out.println(b);
        String c = a;
        System.out.println(c == a);

        // == ---> comparirtor
        System.out.println(a == b);

        String name1 = new String("Pallavi");
        String name2 = new String("Pallavi");
        System.out.println(name1 == name2);

        // .equals ---> methods

        System.out.println(name1.equals(name2));
    }

}
