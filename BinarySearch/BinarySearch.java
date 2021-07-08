package BinarySearch;

/*
* This programme will find the index of given search value from a sorted array in ascending order.
* */


public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int toSearch = 6;
        System.out.println(toSearch + " is at index " + findIndex(arr,toSearch));
    }

    private static int findIndex(int[] arr, int toSearch) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //here we are writing mid in this way just to avoid a case when start and end
            // are tooo high, in that addition will give overflow and int may not be able to handle that
            int mid = start + (end-start)/2;
            if(arr[mid] == toSearch){
                return mid;
            } else if(toSearch < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
