import java.util.*;

public class FindAnagrams {
    public static void main(String[] args){
        String[] input = {"day","ady","back","yda","abck","Zebra"};
        findAnagrams(input);
    }

    private static void findAnagrams(String[] input) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        List<List<String>> listToReturn = new ArrayList<>();
        for(int i = 0 ; i < input.length ; i++){
            String ip = input[i];
            char[] sortedIpArr = ip.toCharArray();
            Arrays.sort(sortedIpArr);
            String sortedInput = String.valueOf(sortedIpArr);
            if(anagramMap.containsKey(sortedInput)){
                List<String> anList = anagramMap.get(sortedInput);
                anList.add(ip);
                anagramMap.put(sortedInput,anList);
            } else{
                List<String> anList = new ArrayList<>();
                anList.add(ip);
                anagramMap.put(sortedInput,anList);
            }
        }
        for(Map.Entry entry : anagramMap.entrySet()){
            listToReturn.add((List<String>)entry.getValue());
        }
        for(List<String> list : listToReturn){
            System.out.println(list.toString());
        }
    }
}
