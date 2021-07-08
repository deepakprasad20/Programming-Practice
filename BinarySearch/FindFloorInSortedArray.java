package BinarySearch;

public class FindFloorInSortedArray {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,7,8,9};
        int toSearch = 0;
        System.out.println("Floor values of " + toSearch + " is " + findFloor(arr,toSearch));
    }

    private static int findFloor(int[] arr, int toSearch) {
        int start = 0 , end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == toSearch){
                return arr[mid];
            } else if(arr[mid] <= toSearch){
                ans = arr[mid];
                start = mid + 1;
            } else if(arr[mid] > toSearch){
                end = mid - 1;
            }
        }
        return ans;
    }
}
