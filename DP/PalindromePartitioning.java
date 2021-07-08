package DP;

/*
* This programme will calculate minimum number of partitioning required to make it palindrome.
* */

public class PalindromePartitioning {
    public static int[][] t = new int[100][100];
    public static void main(String[] args){
        String word = "nntatc";
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                t[i][j] = -1;
            }
        }
        System.out.println("Minimum number of partitioning required = " + solve(word,0,word.length()-1));
    }
    public static int solve(String word, int i , int j){
        if(i >= j){
            return 0;
        }
        if(isPalindrome(word,i,j)){
            return 0;
        }
        if(t[i][j] != -1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int  k = i ; k < j ; k++){
            int left = 0,right = 0;
            if(t[i][k] != -1){
                left = t[i][k];
            } else{
                left = solve(word,i,k);
            }
            if(t[k+1][j] != -1){
                right = t[k+1][j];
            } else{
                right = solve(word,k+1,j);
            }
            int tmp = left + right + 1;
            min = Math.min(min,tmp);
        }
        return t[i][j] = min;
    }

    private static boolean isPalindrome(String word, int i, int j) {
        String wordToCheck = word.substring(i,j+1);
        return  wordToCheck.equals(new StringBuffer(wordToCheck).reverse().toString());
    }
}
