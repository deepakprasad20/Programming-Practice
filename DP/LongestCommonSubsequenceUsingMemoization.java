package DP;

public class LongestCommonSubsequenceUsingMemoization {
    public static int[][] t = new int[100][100];
    public static void main(String[] args){
        String x= "abdefh";
        String y = "abch";
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                t[i][j] = -1;
            }
        }
        System.out.println("Length of longest common subsequence is : " + findLcs(x,y,x.length(),y.length()));
    }

    private static int findLcs(String x, String y, int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }
        if(t[n][n] != -1){
            return t[n][m];
        }
        if(x.charAt(n-1) == y.charAt(m-1)){
            return t[n][m] = 1 + findLcs(x,y,n-1,m-1);
        }
        else{
            return t[n][m] = Math.max(findLcs(x,y,n,m-1) ,findLcs(x,y,n-1,m));
        }
    }
}
