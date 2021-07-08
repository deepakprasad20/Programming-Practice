package BinarySearch;

/*
* This programme is used to find the index of searched item
* in a given sorted array in descending order
* */

public class BinarySearch2 {
    public static void main(String[] args){
        int[] arr = {20,18,15,8,6,3,1};
        int toSearch = 1;
        System.out.println(toSearch + " is at index " + findIndex(arr,toSearch));
    }

    private static int findIndex(int[] arr, int toSearch) {
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == toSearch){
                return mid;
            } else if(toSearch < arr[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
}
