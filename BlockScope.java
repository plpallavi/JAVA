public class BlockScope {
    public static void main(String args[]){
        int a = 45;
        int b = 97;
        String name = "Pallavi";

        {
            a = 87; // we can update the value of a  in the other or same block ....BUT
            System.out.println(a);
        //  int a = 87; // we cannot initialise the same variable in same or different block 
        int c = 55;
        // Value that is initialised int the block... will reamin in block
        System.out.println(c);
        
        name = "Saloni";
        System.out.println(name);

        }
        // System.out.println(c); --> Cannot use outside the block
    }
}
