import java.util.HashMap;
import java.util.Map;

public class CountOccurenceUsingHashMap{
    public static void main(String[] args) {    
        char [] arr = {'a','b','c','d','e','a','b','d','f','g','h'};

        Map<Character , Integer> hm = new HashMap<>();
        for(char c : arr){
            hm.put(c , hm.getOrDefault(c,0)+1);
        }

        System.out.println(hm);
    }
}