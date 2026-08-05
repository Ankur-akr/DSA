package hashmap;

import java.util.HashSet;

public class UnionOfTwoArray {
    static void main() {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {1, 2, 7, 8, 9,6,16};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int j : arr2) {
            set.add(j);
        }
        System.out.println(set);

    }
}
