package hashmap;
// Given an integer array of size n, find all elements that appear more than n/3 times
//nums[] = {1,3,2,5,1,3,1,5,1}  op => 1
//nums[] ={1,2}  op => 1,2


import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    static void main() {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) map.put(j, 1);
            else map.put(j, map.get(j) + 1);
        }
        for (int i : map.keySet()){
            if (map.get(i) > n/3) {
                System.out.println(i);
            }
        }

    }
}
