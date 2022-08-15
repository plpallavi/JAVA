import java.util.Scanner;

public class StringReturn {
    
    public static void main(String args[]){
        String message = greet();
        System.out.println(message);

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = input.next();

        String personalised = myGreet(name);
        //String personalised = myGreet("Pallavi Kumari");
        System.out.println(personalised);
    }

    static String myGreet(String name){
        String message = "Hello this is " + name;
        return message;
    }

static String greet(){
    String greeting = "Hii!!!!, Good Evening";
    return greeting;
    
}

}