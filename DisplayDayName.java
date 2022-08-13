import java.util.Scanner;
// WAP to diapay the day number 
public class DisplayDayName {
    public static void main(String[] args){
        System.out.println("Enter Day Number: ");
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thrusday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
    }
}
