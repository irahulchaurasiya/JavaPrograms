public class MaxMirror {
    public static void main(String[] args) {	
        // int [] nums = {1, 2, 3, 8, 9, 3, 2, 1};
        // int [] nums = {1, 2, 1, 4};
        // int [] nums = {7, 1, 2, 9, 7, 2, 1};
        // int [] nums = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
        int [] nums = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        // int [] nums = {1, 2, 3, 2, 1};


        System.out.println(maxMirror(nums));
        
    }
    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count= 0;
        int max = 0;
        for (int i = 0; i < len; i++){
          count=0;
          for (int j = len-1; i + count < len && j >= 0; j--){
            if(nums[i+count] == nums[j]){
              count++;
            }
            else{
              if (count > 0){
                max = Math.max(count,max);
                count = 0;
              }
            }
          }
          max = Math.max(count,max);
        }
        return max;
      }
}
