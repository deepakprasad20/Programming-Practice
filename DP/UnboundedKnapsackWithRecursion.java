package DP;

public class UnboundedKnapsackWithRecursion {
    public static void main(String[] args){
        int[] val = {1,3,4,5};
        int[] weight = {1,4,5,7};
        int W = 10;
        System.out.println("Maximum value : " + unboundedKnapsack(val,weight,val.length,W));
    }

    private static int unboundedKnapsack(int[] val, int[] weight, int n, int w) {
        if(n == 0 || w == 0){
            return 0;
        }
        if(weight[n-1] <= w){
            return Math.max(val[n-1] + unboundedKnapsack(val,weight,n,w - weight[n-1]),
                    unboundedKnapsack(val , weight , n-1 , w));
        } else{
            return unboundedKnapsack(val , weight , n-1 , w);
        }
    }
}
