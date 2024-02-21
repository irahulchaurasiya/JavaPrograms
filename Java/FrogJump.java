import java.util.HashMap;

public class FrogJump {
    public static void main(String[] args) {
        //int [] stones = {0,1,3,5,6,8,12,17};
        int [] stones = {0,1,2,3,4,8,9,11};

        System.out.println(canCross(stones));
    }

    public static boolean canCross(int[] stones) {
        int n = stones.length;
        
        HashMap<Integer, Integer> stoneIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            stoneIndexMap.put(stones[i], i);
        }
        
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true; 
       
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int distance = stones[i] - stones[j];
                if (distance > j + 1) {
                    break;  
                }
                
                if (dp[j][distance - 1] || dp[j][distance] || dp[j][distance + 1]) {
                    dp[i][distance] = true;
                    if (i == n - 1) {
                        return true;  
                    }
                }
            }
        }
        
        return false;
    }
}
