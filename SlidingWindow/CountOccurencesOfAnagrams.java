package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfAnagrams {
    public static void main(String[] args){
        String str = "aababaabad";
        String target = "aaba";
        System.out.println(countAnagrams(str,target));
    }

    private static int countAnagrams(String str, String target) {
        Map<Character , Integer> wordMap = new HashMap<>();
        int i = 0 , j = 0 , ans = 0, mapSize = 0;
        for(int k = 0 ; k < target.length() ; k++){
            char ch = target.charAt(k);
            wordMap.put(ch,wordMap.getOrDefault(ch,0)+1);
        }
        mapSize = wordMap.size();
        while(j < str.length()){
            char curr = str.charAt(j);
            if(wordMap.containsKey(curr)){
                wordMap.put(curr,wordMap.get(curr)-1);
                if(wordMap.get(curr) == 0){
                    mapSize--;
                }
            }
            if(mapSize == 0){
                ans++;
            }
            if(j-i+1 < target.length()){
                j++;
            } else if(j-i+1 == target.length()){
                char prevWindow = str.charAt(i);
                if(wordMap.containsKey(prevWindow)){
                    int c = wordMap.get(prevWindow);
                    if(c == 0){
                        mapSize++;
                    }
                    wordMap.put(prevWindow,c+1);
                }

                //sliding window
                i++;
                j++;
            }
        }
        return ans;
    }
}
