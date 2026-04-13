import java.util.HashSet;

// class hashsets{
//     public boolean Duplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0;i<nums.length;i++){
//             if(set.contains(nums[i])){
//                 return true;
//             }
//             set.add(nums[i]);
//         }
//         return false;
//     }
// }

public class hashsets {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i < arr.length; i++){

            if(set.contains(arr[i])){
                System.out.println("True");
                return;
            }
            set.add(arr[i]);
        }
        System.out.println("False");
    }
    
}