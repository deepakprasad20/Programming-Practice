public class ThreeSumClosest {
    public static void main(String[] args){
        int[] nums = {1,1,1,0};
        int target = -100;
        System.out.println("3 sum closest to target " + target + " is: " + findClosestSum(nums,target));
    }

    private static int findClosestSum(int[] nums, int target) {
        int i = 0 , j = 0, n = nums.length,sum = 0,minDiff = Integer.MAX_VALUE, closestSum = Integer.MAX_VALUE;
        while(j < n){
            sum+= nums[j];
            if(j-i+1 < 3){
               j++;
            } else if(j-i+1 == 3){
                int diff = Math.abs(target-sum);
                if(diff < minDiff){
                    minDiff = diff;
                    closestSum = sum;
                }
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return closestSum;
    }
}
