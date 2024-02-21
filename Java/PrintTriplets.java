// Link :- https://www.geeksforgeeks.org/print-triplets-with-sum-less-than-or-equal-to-k/

import java.util.Arrays;

public class PrintTriplets {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 7 };
        int n = arr.length;
        int sum = 12;
        printTriplets(arr, n, sum);
    }

    // Method 1 , Time Complexity = O(n3); Space Complexity = O(1);
    // public static void printTriplets(int[] arr, int n, int sum) {
    //     for(int i = 0 ; i < n ; i++)
    //     {
    //         for(int j = i + 1 ; j < n ; j++)
    //         {
    //             for(int k = j + 1 ; k < n ; k++)
    //             {
    //                 if((arr[i] + arr[j] + arr[k]) < sum ){
    //                     System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
    //                 }
    //             }
    //         }
    //     }
    // }

    public static void printTriplets(int [] arr , int n , int sum){
        Arrays.sort(arr);
        for(int i = 0 ; i < n - 2 ; i++)
        {
            int j = i + 1 , k = n - 1;
            while( j < k)
            {
                if((arr[i] + arr[j] + arr[k]) >= sum){
                    k--;
                }
                else
                {
                    for(int x = j + 1 ; x <= k ; x++)
                    {
                        System.out.println(arr[i] + " " + arr[j]  + " "+ arr[x]);
                    }
                    j++;
                }
            }
        }
    }
}
