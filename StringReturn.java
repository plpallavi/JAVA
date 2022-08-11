import java.util.Scanner;

public class StringReturn {
    
    public static void main(String args[]){
        String message = greet();
        System.out.println(message);
    }


static String greet(){
    String greeting = "Hii!!!!, Good Evening";
    return greeting;
}
}