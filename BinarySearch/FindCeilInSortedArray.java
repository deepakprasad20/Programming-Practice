package BinarySearch;

public class FindCeilInSortedArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8,9};
        int toSearch = 7;
        System.out.println("Ceil values of " + toSearch + " is " + findCeil(arr,toSearch));
    }

    private static int findCeil(int[] arr, int toSearch) {
        int start = 0 , end = arr.length-1, ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == toSearch){
                return arr[mid];
            } else if(toSearch > arr[mid]){
                start = mid+1;
            } else if(toSearch < arr[mid]){
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }
}
