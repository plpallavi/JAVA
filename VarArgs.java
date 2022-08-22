import java.util.Arrays;
public class VarArgs {
    public static void main(String args[]){
        fun1(1, 2, 3, 4, 5, 6);
        fun2("Pallavi", "Saloni", "Nishant", "Samrat");
        multiple(5, 6, "Pallavi", "Saloni");
    }
    static void fun1(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));

    }
    
}
