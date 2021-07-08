package BinarySearch;

/*
* This programme is used to find the 1st occurrence of an element to be searched from a sorted array
* in ascending order.
* */

public class FindFirstOccurrence {
    public static void main(String[] args){
        int[] arr = {2,4,6,10,10,10,10,12,14,15};
        int toSearch = 10;
        System.out.println("First occurrence of "+ toSearch + " is at index " + findFirstIndex(arr,toSearch));
    }

    private static int findFirstIndex(int[] arr, int toSearch) {
        int start = 0 , end = arr.length-1, minIndex = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == toSearch){
                minIndex = mid;
                end = mid-1;
            } else if(toSearch < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return minIndex;
    }
}
