public class stringSrchInRange {
    public static void main(String[] args) {
        String name = "PallaviNishantSamrat";
        char target = 'l';
        System.out.println(search(name, target, 1, 6));
    }

    static boolean search(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)) {
                if()
                return target;
            }
        }
        return false;
    }
}
