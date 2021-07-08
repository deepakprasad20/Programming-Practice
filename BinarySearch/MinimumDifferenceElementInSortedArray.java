package BinarySearch;

public class MinimumDifferenceElementInSortedArray {
    public static void main(String[] args){
        int[] arr = {1,3,8,10,13,15};
        int key = 12;
        System.out.println("Minimum difference with key " +
                key +  " from given array will come by " + findMinimumdifference(arr,0,arr.length,key));
    }

    private static int findMinimumdifference(int[] arr,int start , int end, int key) {
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                return arr[mid];
            } else if(key < arr[mid]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        int first = Math.abs(key - arr[start]);
        int second = Math.abs(key - arr[end]);
        return first < second ? arr[start] : arr[end];
    }
}
