public class MaxConsecutiveOne {
    public static void main(String[] args)
    {
        boolean arr[] = {true, true, false, false, 
                         true, false, true, false,
                           true, true, true, true};
                            
        int n = arr.length;
         
        System.out.println(getMaxLength(arr, n));
    }

    public static int getMaxLength(boolean[] arr, int n) {
        int count = 0;
        int max = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] == false){
                count = 0;
            }
            else
            {
                count++;
                max = Math.max(count , max);
            }
            max = Math.max(count , max);
        }

        return max;
    }
}
