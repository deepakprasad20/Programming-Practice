package BinarySearch;

public class PeakElement {
    public static void main(String[] args){
        int[] arr = {5,10,15,2,6};
        System.out.println("Peak Element is : " + findPeakElement(arr));
    }

    private static int findPeakElement(int[] arr) {
        int low = 0 , high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid > 0 && mid < arr.length-1){
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return arr[mid];
                } else if(arr[mid+1] > arr[mid]){
                    low = mid+1;
                } else{
                    high = mid-1;
                }
            } else if(mid == 0){
                if(arr[mid] > arr[mid+1]){
                    return arr[mid];
                } else{
                    return arr[mid+1];
                }
            } else if(mid == arr.length-1){
                if(arr[mid] > arr[mid-1]){
                    return arr[mid];
                } else{
                    return arr[mid-1];
                }
            }
        }
        return -1;
    }
}
