// Link :- https://www.geeksforgeeks.org/merging-two-unsorted-arrays-sorted-order/

import java.util.Arrays;

public class MergeIntoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {10 , 5 , 15};
        int [] arr2 = {20 , 3 , 2};

        int n = arr1.length;
        int m = arr2.length;

        int [] ans = new int[n+m];
        int i = 0 , j = 0 , k = 0;

        // Time Complexity =   O(n+m) log(n+m); Space = O(n+m);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < n){
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while(j < m){
            ans[k] = arr2[j];
            j++;
            k++;
        }

        for(int a : ans)
        {
            System.out.print(a + " ");
        }
    }
}
