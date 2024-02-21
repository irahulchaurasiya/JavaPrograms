// Link :- https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Scanner;

public class SquareSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int [] ans = sortedSquares(arr);

        for(int i : ans)
        {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];
        int i = 0 , j = nums.length - 1;
        for(int k = nums.length - 1 ; k >= 0 ; k--)
        {
            int iSquare = nums[i]*nums[i];
            int jSquare = nums[j]*nums[j];

            if(iSquare > jSquare)
            {
                ans[k] = iSquare;
                i++;
            }
            else
            {
                ans[k] = jSquare;
                j--;
            }
        }
        return ans;
    }
}