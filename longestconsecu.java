
import java.util.HashSet;

public class longestconsecu {
    public static void main(String[] args) {
        int[] nums = {10, 5, 12, 3, 55, 4, 11};
        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(100);
        // set.add(200);
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        // System.out.println(set);
            for(int num : set){
                if(!set.contains(num - 1)){
                    int currentNum = num;
                    int count = 0;
                    while(set.contains(currentNum)){
                        count++;
                        currentNum++;
                    }
                    longest = Math.max(count, longest);                    
                }
            }
            System.out.println(longest);
    }
    // class Solution{
    //     public int longestConsecutive(int[] nums) {
    //         HashSet<Integer> set = new HashSet<>();
    //         for(int num : nums){
    //             set.add(num);
    //         }
    //         int longest = 0;
    //         for(int num : set){
    //             if(!set.contains(num - 1)){
    //                 int currentNum = num;
    //                 int count = 0;
    //                 while(set.contains(currentNum)){
    //                     currentNum++;
    //                     count++;
    //                 }
    //                 longest = Math.max(longest , count);
    //             }
    //         }       
    //         return longest;
    //     }
    // }
}
