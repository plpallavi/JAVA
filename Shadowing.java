public class Shadowing {
    static int x = 68;  // this will shadow at line 8
    public static void main(String args[]){
        System.out.println(x);
        // int x = 45; // the class variable at line 4 will shadowed by this
        // since this available for only this block ... so this is not acceessiable for fun block
        int x;
        x = 12;
        System.out.println(x);
        fun();

    }

    static void fun(){
        System.out.println(x);
    }
}
