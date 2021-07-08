package DP;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static int[][] t = new int[100][100];
    public static void main(String[] args){
        int[] arr = {40,20,30,10,30};
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                t[i][j] = -1;
            }
        }
        System.out.println("Minimum cost to multiply is : " + solve(arr,1,arr.length-1));
    }

    private static int solve(int[] arr, int i, int j) {
        if(i >= j){
            return 0;
        }
        if(t[i][j] != -1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k = i ; k < j ; k++){
            int tmp = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            min = Math.min(min,tmp);
        }
        return t[i][j] = min;
    }
}
