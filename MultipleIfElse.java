public class MultipleIfElse {
    public static void main(String args[]){

        int salary = 5000;
        int new_salary;

        if(salary>10000){
            new_salary = salary+ 3000;
        }
        
        else if(salary>20000){
            new_salary = salary + 6000;
        }

        else if(salary>25000){
            new_salary = salary + 9000;
        }

        else{
            new_salary = salary+ 1000;
        }

        System.out.println(new_salary);

    }
    
}
