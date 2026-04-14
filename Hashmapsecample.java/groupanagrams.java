import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class groupanagrams {
    public static void main(String[] args) {
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : a){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        System.out.println(map.values());

        
    }
}
