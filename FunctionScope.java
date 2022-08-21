public class FunctionScope { 
    public static void main(String args[]){
        int a = 10;
        int b = 15;

        System.out.println(a); // it is accessiable coz num is in the same function
        random();
    }

    static void random(){
    //    System.out.ptintln(a); // can't accessed the a becoz a is in the another function
    int num = 189;
    System.out.println(num); // it is accessiable coz num is in the same function
    }

    
}
