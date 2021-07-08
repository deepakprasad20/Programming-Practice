package SlidingWindow;

public class MaximumSumSubarray {
    public static void main(String[] args){
        int k = 3;
        int[] arr = {2,4,3,5,7,6,8,9,1};
        System.out.println("Maximum sum with window " + k + " is " + findMaximumSum(arr,k));
    }

    private static int findMaximumSum(int[] arr, int k) {
        int i = 0 , j = 0;
        int n = arr.length, max = 0,sum = 0;
        while(j < n){
            if(j-i+1 <= k){
                sum+=arr[j];
                max = sum;
                j++;
            } else{
                sum = sum + arr[j] - arr[i];
                max = Math.max(sum , max);
                i++;
                j++;
            }
        }
        return max;
    }
}
