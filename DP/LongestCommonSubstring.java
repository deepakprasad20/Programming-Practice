package DP;

public class LongestCommonSubstring {
    public static void main(String[] args){
        String x = "abdefh";
        String y = "abch";
        System.out.println("Length of longest common substring is : " + findLcs(x,y,x.length(),y.length()));
    }

    private static int findLcs(String x, String y, int n, int m) {
        int[][] t = new int[n+1][m+1];
        int result = 0;
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < m+1 ; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < m+1 ; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    result = Integer.max(result,t[i][j]);
                } else{
                    t[i][j] = 0;
                }
            }
        }
        return result;
    }
}
