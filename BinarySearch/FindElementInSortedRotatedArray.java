package BinarySearch;

public class FindElementInSortedRotatedArray {
    public static void main(String[] args){
        int[] arr = {11,12,15,18,2,4,5,6};
        int target = 15;
        int minIndex = findIndexOfSmallestElement(arr , 0 ,arr.length-1);
        if(arr[minIndex] == target){
            System.out.println(target + " is found at index : " + minIndex);
        } else {
            int leftSide = binarySearch(arr, 0, minIndex - 1, target);
            int rightSide = binarySearch(arr, minIndex + 1, arr.length - 1, target);
            System.out.println(target + " is at index : " +
                    (leftSide == -1 ? rightSide  : leftSide));
        }
    }

    private static int findIndexOfSmallestElement(int[] arr, int start, int end){
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

    private static int binarySearch(int[] arr, int start, int end,int target) {
        if(start > end){
            return 0;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
}
