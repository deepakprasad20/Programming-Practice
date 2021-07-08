package DP;

public class CountOfSubsetSumWithGivenDifference {
    public static void main(String[] args){
        int[] arr = {1,1,2,4};
        int diff = 1,sum = 0,result = 0;
        for(int num : arr){
            sum+= num;
        }
        result =(sum +diff)/2;
        System.out.println("Count of subsetSum with given Difference is : " + countOfSubsetSum(arr,result,arr.length));
    }

    private static int countOfSubsetSum(int[] arr, int result,int n) {
        int[][] t = new int[n + 1][result + 1];
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < result + 1 ; j++){
                if(i == 0){
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
            }
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < result + 1 ; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
                } else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][result];
    }
}
