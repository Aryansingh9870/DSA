import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class topkfrequency {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3};
        int k = 2;
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a1, a2) -> a2.getValue() - a1.getValue());
        for(int i = 0;i<k;i++){
            result[i] =list.get(i).getKey();
        }
        System.out.println(Arrays.toString(result));
    }
    
} 

// public int[] topKFrequent(int[] nums, int k) {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     for(int num : nums){
//         map.put(num, map.getOrDefault(num, 0) + 1);
//     }
//     List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//     Collections.sort(list, (a1, a2) -> a2.getValue() - a1.getValue());
//     int[] result = new int[k];
//     for(int i = 0;i<k;i++){
//         result[i] =list.get(i).getKey();
//     }
//     return result;
// }