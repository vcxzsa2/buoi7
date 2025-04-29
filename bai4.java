package buoi7;
import java.util.*;

public class bai4 {
    public static boolean hasIntersection(Set<Integer> setA, Set<Integer> setB) {
        for (Integer element : setA) {
            if (setB.contains(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        boolean result = hasIntersection(set1, set2);
        System.out.println("Hai tập có phần tử giao nhau không? " + result);
    }
}

