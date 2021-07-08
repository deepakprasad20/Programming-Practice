/**
 * Program to find minimum cost to connect all ropes of unit length.
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println("minimum cost required to connect all ropes are : "+findTopKFrequentNumber(arr));
    }

    private static int findTopKFrequentNumber(int[] arr) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int cost = 0;
        for(int i = 0 ; i < arr.length ; i++){
            minheap.add(arr[i]);
        }
        while(minheap.size() > 1){
            int min1 = minheap.poll();
            int min2 = minheap.poll();
            cost = cost + min1+min2;
            minheap.add(min1+min2);
        }
        return cost;
    }
}
class Entry implements Comparable<Entry>{
    int key;
    int value;

    public Entry(int key,int value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Entry other) {
        return this.getKey() - other.getKey();
    }
}
