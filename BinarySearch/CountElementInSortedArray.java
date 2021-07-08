package BinarySearch;

/*
* This programme is used to find number of occurrences a number is there in a sorted array.
* */


public class CountElementInSortedArray {
    public static void main(String[] args){
        int[] arr = {2,4,6,10,10,10,10,12,14,15};
        int toSearch = 17;
        System.out.println("Number of element of "+ toSearch + " in array is " + countElement(arr,toSearch));
    }

    private static int countElement(int[] arr, int toSearch) {
        int start = 0 , end = arr.length-1, firstIndex = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == toSearch){
                firstIndex = mid;
                end = mid-1;
            } else if(toSearch < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        start = 0;
        end = arr.length-1;
        int lastIndex = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == toSearch){
                lastIndex = mid;
                start = mid+1;
            } else if(toSearch < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        if(firstIndex != -1 && lastIndex != -1){
            return lastIndex - firstIndex + 1;
        } else{
            return -1;
        }
    }
}
