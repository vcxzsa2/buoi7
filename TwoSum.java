package buoi7;
import java.util.*;
class TwoSum {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return true;
            } else if(sum < target){
                i += 1;
            } else {
                j -= 1;
            }
        }
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
//        int[] arr = {1, 4, 45, 6, 10, 8};
//        int target = 16;

        int arr[] = {11};
        int target = 11;

        boolean check = ts.twoSum(arr, target);

        if(check){
            System.out.print("" + check);
        } else {
            System.out.print("" + check);
        }
    }
}