package DP;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        String x= "abdefh";
        String y = "abch";
        System.out.println("Length of longest common subsequence is : " + findLcs(x,y,x.length(),y.length()));
    }

    private static int findLcs(String x, String y, int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }
        if(x.charAt(n-1) == y.charAt(m-1)){
            return 1 + findLcs(x,y,n-1,m-1);
        }
        else{
            return Math.max(findLcs(x,y,n,m-1) ,findLcs(x,y,n-1,m));
        }
    }
}
