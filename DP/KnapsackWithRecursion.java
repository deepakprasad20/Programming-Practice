package DP;

public class KnapsackWithRecursion {
    public static void main(String[] args){
        int[] val = {1,3,4,5};
        int[] weight = {1,4,5,7};
        int W = 10;
        System.out.println("Maximum value : " + knapsack(val,weight,W,val.length));
    }

    private static int knapsack(int[] val, int[] weight, int w, int n) {
        if(n == 0 || w == 0){
            return 0;
        }
        if(weight[n-1] <= w){
            return Math.max((val[n-1]+knapsack(val,weight,w-weight[n-1],n-1)),knapsack(val,weight,w,n-1));
        } else{
            return knapsack(val,weight,w,n-1);
        }
    }
}
