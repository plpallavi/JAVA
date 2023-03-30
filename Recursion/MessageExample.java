public class MessageExample {

    static void message() {
        System.out.println("Good Morning");
        message1();
    }

    static void message1() {
        System.out.println("Good Afternoon");
        message2();
    }

    static void message2() {
        System.out.println("Good Evening");
        message3();
    }

    static void message3() {
        System.out.println("Good Night");
    }

    public static void main(String[] args) {
        message();
    }
}