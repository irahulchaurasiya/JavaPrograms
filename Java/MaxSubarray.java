public class MaxSubarray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i : arr){
            if(sum >= 0)
            {
                sum += i;
            }
            else
            {
                sum = i;
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}
