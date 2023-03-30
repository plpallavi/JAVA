public class BSInRecusion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 13, 18, 98, 165 };
        int target = 98;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;
        
        if(arr[m] == target){
            return m;
        }

        if (target < arr[m]){
            return search(arr,target,s,m-1);
        }
            return search(arr,target,m+1,e);
    }
}
