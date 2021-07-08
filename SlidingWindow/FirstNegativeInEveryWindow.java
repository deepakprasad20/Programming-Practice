package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindow {
    public static void main(String[] args){
        int k = 3;
        int[] arr = {2,-1,-5,4,8,-10,12,13,15};
        System.out.println(findFirstNegative(arr,k));
    }

    private static List<Integer> findFirstNegative(int[] arr, int k) {
        int i = 0 , j = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        while(j < arr.length){
            if(arr[j] < 0){
                queue.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            } else if(j-i+1 == k){
                if(queue.isEmpty()){
                    result.add(0);
                }else {
                    result.add(queue.peek());
                    if(arr[i] == queue.peek()){
                        queue.poll();
                    }
                }

                i++;
                j++;
            }
        }
        return result;
    }
}
