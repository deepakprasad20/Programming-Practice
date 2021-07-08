package BinarySearch;

public class NextAlphabet {
    public static void main(String[] args){
        char[] arr = {'a','b','c','f','f','g','h'};
        char target = 'z';
        System.out.println("Character just after " + target + " in given array is "
                + findNextAlphabet(arr,0,arr.length-1,target));
    }

    private static char findNextAlphabet(char[] arr, int start, int end, char target) {
        char res = '#';
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                start = mid +1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            } else{
                res = arr[mid];
                end = mid -1;
            }
        }
        return res;
    }
}
