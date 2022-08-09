import java.util.Scanner;
// Basic Fruit Program

public class SwitchCaseStatement {
    public static void main(String args[]){
        System.out.println("Enter fruit name: ");
        Scanner in = new Scanner (System.in);
        String fruit = in.next();

        switch(fruit){
            case "mango":
            System.out.println("King of Fruits");
            break;

            case "apple":
            System.out.println("A healthy Fruit");
            break;

            case "litchi":
            System.out.println("Children's fav Fruit");
            break;

            case "default":
            System.out.println("Enter a valid fruit name");
        }
    }
    
}
