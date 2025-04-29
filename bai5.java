package buoi7;
import java.util.*;
public class bai5 {
    public static void printRepeating(int[] arr, int n) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        for (int i : freq.keySet()) {
            if (freq.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,4,5,6};
        int n = arr.length;
        printRepeating(arr, n);
    }
}
