package DP;

import java.util.HashMap;

public class SequencePatternMatching {
    public static void main(String[] args) {
        String s1 = "abx";
        String s2 = "acbdfz";
        System.out.println(s1 + " is a subsequence of " + s2 + " ? " + sequenceMatching(s1, s2));
    }

    private static boolean sequenceMatching(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i < m+1 ; i++){
            for(int j = 0 ; j < n+1 ; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < m+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1] + 1;
                } else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return s1.length() == t[m][n];
    }
}
