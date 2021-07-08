package DP;

import java.util.Arrays;

public class UnboundedKnapsackWithMemoization {
    public static int[][] t = new int[100][100];
    public static void main(String[] args){
        int[] val = {1,3,4,5};
        int[] weight = {1,4,5,7};
        int W = 10;
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                t[i][j] = -1;
            }
        }
        System.out.println("Maximum value : " + unboundedKnapsack(val,weight,val.length,W));
    }

    private static int unboundedKnapsack(int[] val, int[] weight, int n, int w) {
        if(n == 0 || w == 0){
            return 0;
        }

        if(t[n][w] != -1){
            return t[n][w];
        }

        if(weight[n-1] <= w){
            return t[n][w] = Math.max(val[n-1] + unboundedKnapsack(val,weight , n , w-weight[n-1]),
                    unboundedKnapsack(val,weight,n-1,w));
        } else{
            return t[n][w] = unboundedKnapsack(val,weight,n-1,w);
        }
    }
}
