import java.util.Scanner;
public class EnhancedSwitchCase {
// Basic Fruit Program with Enhanced switch Case statement

    public static void main(String args[]){
        System.out.println("Enter fruit name: ");
        Scanner in = new Scanner (System.in);
        String fruit = in.next();

        switch(fruit){
            case "mango"->System.out.println("King of Fruits");

            case "apple"->System.out.println("A healthy Fruit");
            
            case "litchi"->System.out.println("Children's fav Fruit");
            
            case "default"->System.out.println("Enter a valid fruit name");
        }
    }
    
}


