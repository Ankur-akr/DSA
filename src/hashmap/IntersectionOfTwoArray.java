package hashmap;

import java.awt.*;
import java.util.HashSet;

public class IntersectionOfTwoArray {
    static void main() {
        
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {1, 2, 7, 8, 9,6,16};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2){
            if(set.contains(i)){
                System.out.println(i);
                set.remove(i);
            }
        }
    }
}
