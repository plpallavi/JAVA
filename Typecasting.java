import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // float num = input.nextFloat();
       // int num = input.nextInt();

        // TypeCasting

        // int num = (int)(67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions

        byte a = 50;
        byte b = 30;
        byte c = 50;
        int d = a*b/c;

        System.out.println(d);

        int num1 = 'A';
        System.out.println(num1);

        int num2 = 'a';
        System.out.println(num2);

        // Java is unicode



    }
    
}
