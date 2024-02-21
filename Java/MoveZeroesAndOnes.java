public class MoveZeroesAndOnes {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 1, 1, 1, 0 , 0};
        int n = arr.length;

        movePlaces(arr,n);

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void movePlaces(int[] arr, int n) {
        int i = 0;
        int j = n - 1;

        while( i < j){
            if(arr[i] == 1)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else
            {
                i++;
            }
        }
    }
}
