// Link :- https://afteracademy.com/blog/move-all-the-zeroes-to-the-end/

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr = {0,0,2,1,0,4,0,8,0,6,9,0,0,7,31};
        int n = arr.length;

        int j = 0;

        for( int i = 0 ; i < n ; i++){
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }

        while( j < n)
        {
            arr[j] = 0;
            j++;
        }

        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
