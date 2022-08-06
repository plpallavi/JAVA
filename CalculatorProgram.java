import java.util.Scanner;

public class CalculatorProgram {
    
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int ans=0;

        while (true){
            // Take the operator ass input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                // Input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();


                if(op == '+'){
                    ans = num1 + num2;
                }

                if (op == '-'){
                    ans = num1 + num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if(num2 != 0){
                        ans = num1/ num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X' ){
                break;
            }
            else{
                System.out.println("Invalid operator!!!");
            }
            System.out.print("Answer is: ");
            System.out.println(ans);
                }
        
    }
}
