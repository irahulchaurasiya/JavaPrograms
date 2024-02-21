// Link :- https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/

import java.util.HashMap;
import java.util.Map;

public class PrintOccurenceByOrder {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Map<Character , Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(char c : s.toCharArray()){
            if(hm.get(c) > 0)
            {
                System.out.println(c + " " + hm.get(c));
                hm.put(c,0);
            }
        }
    }
}
