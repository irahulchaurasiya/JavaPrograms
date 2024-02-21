public class MaxOf2DColumns {
    public static void main(String[] args) {
        int[][] twoDArray = {{1, 5, 3},{4, 8, 2},{7, 1, 6}};
        int n = twoDArray.length;
        int m = twoDArray[0].length;

        int [] ans = findMax(twoDArray,n,m);

        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.println(i + " " + ans[i]);
        }
    }

    public static int[] findMax(int[][] twoDArray, int n, int m) {
        int [] ans = new int[m];

        for(int i = 0 ; i < n ; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < m ; j++)
            {
                if(twoDArray[i][j] > max)
                {
                    max = twoDArray[i][j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}
