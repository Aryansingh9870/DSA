// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;


public class encodedecode {
    public String encode(List<String> str){
        StringBuilder sb = new StringBuilder();
        for(String strs : str){
            sb.append(strs.length()).append("#").append(strs);
        }    
        return sb.toString();
    }
    public List<String> decode(String s){
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < s.length()){
            int j=i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(s.substring(i,j));
            j++;
            String word = s.substring(j, j+length);
            result.add(word);
            i=j+length;
        }

        return result;
    }

    public static void main(String[] args) {
        encodedecode obj = new encodedecode();

        List<String> input = new ArrayList<>();
        input.add("ab");
        input.add("xyz");
        input.add("hulhiuhi");
        String encoded = obj.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = obj.decode(encoded);
        System.out.println("Decoded: " + decoded);
         
    }
}
