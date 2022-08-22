public class FunctionOverloading {
    public static void main(String args[]){
        fun(10);
        fun("Pallavi");
        fun(45,"Mango");
        int ans = sum(10, 20);
        System.out.println(ans);
        int ans2 = sum(10,20,30);
        System.out.println(ans2);

    }
    
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int b,String fruit){
        System.out.println(b);
        System.out.println(fruit);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
