import java.util.HashMap;

// public class hashmap {
//     public static void main(String[] args){
//         HashMap<Character, Integer> map = new HashMap<>();

//         map.put('a', 1);
//         map.put('b', 2);
//         map.put('c', 3);
//         System.out.println(map.get('a'));
//     }
// }
// public class hashmap {

//     public static void main(String[] args) {
//         String a = "abb";

//         HashMap<Character, Integer> map = new HashMap<>();

//         for(char c : a.toCharArray()){
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         System.out.println(map);
//     }
// }
// public class hashmap {

//     public static void main(String[] args) {
//         String a = "aryan";
//         String b = "naral";

//         HashMap<Character, Integer> map = new HashMap<>();

//         for(char c : a.toCharArray()){
//             map.put(c, map.getOrDefault(c,0)+1);
//         }
//         for(char c : b.toCharArray()){
//             map.put(c, map.getOrDefault(c,0)-1);
//         }
//         for(int value : map.values()){
//             if(value !=0){
//                 System.out.println("False");
//                 return;
//             }
//         }
//         System.out.println("True");
//     }
// }
public class hashmap {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int target = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
            int nees = target - a[i];
            if(map.containsKey(nees)){
                System.out.println(nees+" "+a[i]);
                // return;
            }
            map.put(a[i], i);
            
        }
        System.out.println("No pair found");

    }
}