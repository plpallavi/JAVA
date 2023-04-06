import java.util.ArrayList;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 5, arr.length - 1));
        // findAllIndex(arr, 6, 0);
        // System.out.println(list);
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));

        // System.out.println(findAllIndex2(arr, 4, 0));
    }

    // Sorted Array
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    // Linear Search Using recursion
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    // Linear Search (on multiple occurences)
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    // Return an ArrayList
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // Return List without passing argument
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // * * * In this approach we are creating object continuously--- So don't use
    // this approach... use above approach * * *
    // static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
    // ArrayList<Integer> list = new ArrayList<>();

    // if (index == arr.length) {
    // return list;
    // }
    // // this will contain anser for that function call only
    // if (arr[index] == target) {
    // list.add(index);
    // }
    // ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

    // list.addAll(ansFromBelowCalls);

    // return list;
    // }
}
