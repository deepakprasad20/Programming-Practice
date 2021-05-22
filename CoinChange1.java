/*
* This program is used to find number of ways
*  we can get a given sum from a given coin array.
* */
public class CoinChange1 {
    public static void main(String[] args) {
        int[] coin = {1, 2,3};
        int sum = 5;
        System.out.println("Number of ways to get sum as " + sum + " is : " + coinChange(coin,sum));
    }
    public static int coinChange(int[] coin , int sum){
        int n = coin.length;
        int[][] t = new int[n+1][sum+1];
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < sum+1 ; j++){
                if( i == 0){
                    t[i][j] = 0;
                }
                if( j == 0){
                    t[i][j] = 1;
                }
            }
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < sum+1 ; j++){
                if( coin[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i][j-coin[i-1]];
                } else{
                    t[i][j] = t[i-1][j];
                }

            }
        }
        return t[n][sum];
    }
}
