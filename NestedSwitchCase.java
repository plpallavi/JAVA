import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int studentID = in.nextInt();
        String department = in.next();

        switch(studentID){
            /* 
            case 1:
                System.out.println("Pallavi");
                break;

            case 2: 
                System.out.println("Saloni");
                break;
            case 3:
                System.outprintln(Student Id 3)
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    
                    case "CSE":
                        System.out.println("CSE Department");
                        break;

                    case "ECE":
                        System.out.println("ECE Department");
                        break;
                    
                    case "Default":
                        System.out.println("Invalid Department");
                }

            default:
                System.out.println("Enter correct studentId");
                break;
                
            */

            case 1 -> System.out.println("Pallavi");
            case 2 ->System.out.println("Saloni");
            case 3 ->{
                System.out.println("Student Id 3");
                switch(department){
                    case "IT" -> System.out.println("IT Department");
                        
                    case "CSE" -> System.out.println("CSE Department");
                    
                    case "ECE" -> System.out.println("ECE Department");
                        
                    case "Default" -> System.out.println("Invalid Department");
                }

            }
            default -> System.out.println("Enter correct studentId");
                
            }
            
    }
}
