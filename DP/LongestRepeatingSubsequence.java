package DP;

public class LongestRepeatingSubsequence {
    public static void main(String[] args){
        String s = "ABAECBEDD";
        System.out.println("Length of longest repeating subsequence is : " +
                findLongestRepeatingSubsequence(s));
    }

    private static int findLongestRepeatingSubsequence(String s) {
        int length = s.length();
        int[][] t = new int[length+1][length+1];
        for(int i = 0 ; i < length +1 ; i++){
            for(int j = 0 ; j < length+1 ;j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < length +1 ; i++){
            for(int j = 1 ; j < length+1 ;j++){
                if(s.charAt(i-1) == s.charAt(j-1) && i != j){
                    t[i][j] = t[i-1][j-1] + 1;
                } else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[length][length];
    }
}
