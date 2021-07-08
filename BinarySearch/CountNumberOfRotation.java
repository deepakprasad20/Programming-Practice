package BinarySearch;

public class CountNumberOfRotation {
    public static void main(String[] args){
        int[] arr = {11,12,15,18,2,4,5,6};
        System.out.println("Number of times the array anti-clockwise rotated is : " + countRotation(arr,0,arr.length-1));
    }

    private static int countRotation(int[] arr , int start , int end) {
        if(start > end){
            return 0;
        }
        int n = arr.length;
        while(start <= end){
            if(arr[start] <= arr[end]){
                return start;
            }
            int mid =  start + (end-start)/2;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            } else if(arr[start] <= arr[mid]){
                start = mid+1;
            } else if(arr[mid] <= arr[end]){
                end = mid-1;
            }
        }
        return -1;
    }
}
