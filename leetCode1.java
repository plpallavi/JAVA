// Find Numbers with Even Number of Digits
public class leetCode1 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
        // To find the num of digits in given digit
        System.out.println(digits(3456789));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
         * if(numberofDigits % 2 == 0){
         * return true;
         * }
         * return false;
         */
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        // for negative number
        if (num < 0) {
            num = num * -1;
        }
        // if num = 0

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10

        }
        return count;
    }

}
