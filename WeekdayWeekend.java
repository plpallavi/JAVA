import java.util.Scanner;

public class WeekdayWeekend {

    public static void main(String args[]) {
        System.out.println("Enter the Day number: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            /* 
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
                */
        }
    }
}
