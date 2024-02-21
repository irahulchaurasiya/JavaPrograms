// Link :- https://www.geeksforgeeks.org/elements-that-occurred-only-once-in-the-array/

// import java.sql.Array;
// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.List;
import java.util.Map;
// import java.util.Scanner;

public class ElementOccurredOnce {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i = 0 ; i < n ; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        int[] arr = { 7, 7, 8, 8, 9, 1, 1, 4, 2, 2 };
        int n = arr.length;

        Map<Integer , Integer> hm = new HashMap<>();

        for(int i : arr)
        {
            hm.put(i , hm.getOrDefault(i, 0)+1);
        }


        for(int i : hm.keySet())
        {
            if(hm.get(i) == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
}
