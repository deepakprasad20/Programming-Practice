package BinarySearch;

/*
* This programme is used to find an element x in a nearly sorted array , means the array will be
* nearly sorted arr[i] can be at i or i-1 or i+1th position in a sorted array.
* */

public class FindElementInNearlySortedArray {
    public static void main(String[] args){
        int[] arr = {5,10,15,20,30,35,40,45,50,55,65,60,70};
        int target = 65;
        System.out.println(target + " is at index " + findIndex(arr,0 , arr.length-1,target));
    }

    private static int findIndex(int[] arr, int start, int end, int target) {
        if(start > end){
            return 0;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if(mid -1 >= start && arr[mid-1] == target){
                return mid-1;
            } else if(mid + 1 <= end && arr[mid+1] == target){
                return mid+1;
            }
            if(target > arr[mid]){
                start = mid+2;
            } else if(target <= arr[mid]){
                end = end-2;
            }
        }
        return -1;
    }
}
