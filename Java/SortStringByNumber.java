public class SortStringByNumber {
    public static void main(String[] args) {
        String s = "my1 name2 is4 a3rpit";


        String [] arr = s.split("\\s+");

        int [] ans = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++)
        {
            String str = arr[i];
            for(char c : str.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    int a = Character.getNumericValue(c) ;
                    ans[a-1] = i;
                }
            }
        }

        for(int i : ans){
            System.out.print(arr[i] + " ");
        }
    }
}
