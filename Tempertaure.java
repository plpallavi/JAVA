import java.util.Scanner;

public class Tempertaure {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperture in celcius: ");
        float tempc = in.nextFloat();
        
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);


    }
    
}
