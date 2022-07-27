import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String arg[]){
        Scanner in = new Scanner (System.in);
        //char ch = in.next().trim().charAt(3);
        // System.out.print(ch);
        
        //String word = "hello";
        //System.out.println(word.charAt(1));
        
        char ch = in.next().trim().charAt(0);
    
        if(ch >= 'a' && ch >= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}