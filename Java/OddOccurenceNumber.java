import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurenceNumber {
    public static void main(String[] args) {
        int arr[] = {6, 5, 2, 5, 4, 2, 6 , 3 , 8 , 1};

        Map<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault(i , 0) +1);
        }

        // for(int i : hm.keySet())
        // {
        //     if(hm.get(i)%2 != 0)
        //     {
        //         System.out.print(i + " ");
        //     }
        // }

        Arrays.stream(arr).filter(i -> hm.get(i)%2!=0).forEach( i ->{
            System.out.print(i+" ");
            });
    }
}
