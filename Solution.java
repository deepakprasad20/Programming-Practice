
import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args){
        int[][] arr= {{-5}};
        int k = 1;
        System.out.println(kthSmallest(arr,k));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                minHeap.add(matrix[i][j]);
            }
        }
        while(!minHeap.isEmpty() && minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.isEmpty() ? -1 : minHeap.peek();
    }

    /*public static int maxSubArray(int[] nums) {
        int sum  = 0 , maxSum = Integer.MIN_VALUE , i = 0 , j = nums.length-1;
        for(int num : nums){
            sum+=num;
        }
        return solve(nums,i,j,sum);
    }
    public static int solve(int[] nums , int i , int j,int sum){
        if(i > j){
            return 0;
        }
        if(nums[i] < nums[j]){
           return solve(nums,i+1,j,sum-nums[i]);
        } else if (nums[i] > nums[j]){
            return sum - solve(nums,i,j-1,sum-nums[j]);
        } else{
            return Math.max(solve(nums,i+1,j,sum-nums[i]),solve(nums,i,j-1,sum-nums[j]));
        }
    }*/

    /*public static int minSetSize(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = arr.length, count = arr.length;
        for(int num : arr){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            } else{
                mp.put(num,1);
            }
        }
        Map<Integer,Integer> sortedMap = mp.entrySet()
                .stream()
                .sorted((i1,i2) -> i2.getValue().compareTo(i1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2) -> e1,LinkedHashMap::new));
        Set<Integer> st = new HashSet<>();
        for(Map.Entry entry : sortedMap.entrySet()){
            int freq = (int)entry.getValue();
            count = count-freq;
            st.add((int)entry.getKey());
            if(count < (n/2)){
                return st.size();
            }
        }
        return -1;
    }*/

    /*public static List<Integer> grayCode(int n) {
        int number = Integer.parseInt("0011",2);
        return list;
    }*/

    /*public static boolean canJump(int[] nums) {
        int numberOfJumps = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (numberOfJumps == 0) {
                return false;
            }
            numberOfJumps = Math.max(numberOfJumps - 1, nums[i]);
        }
        return true;
    }*/
    /*public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        char[][] arr = {{'a','b','c'},{'d','e','f'},{'g','h','i'},
                        {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                        {'t','u','v'},{'w','x','y','z'}};
        List<String> result = new ArrayList<>();
        solve(0, new StringBuilder() , result , digits , arr);
        return result;

    }
    public static void solve(int i , StringBuilder str,List<String> result , String digit , char[][] arr){
       if(i >= digit.length()){
           result.add(str.toString());
           return;
       }
       char dig = digit.charAt(i);
       for(char c : arr[Character.getNumericValue(dig)-2]){
           str.append(c);
           solve(i+1,str,result,digit,arr);
           str.deleteCharAt(str.length()-1);
       }
    }*/

    /*public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
           char curr = s.charAt(i);
           char pos = '#';
           if(!stack.isEmpty()) {
                pos = stack.peek();
           }
            if(pos != '#' && curr == pos){
                stack.pop();
            }  else{
                stack.push(curr);
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }*/


    /*public static boolean canBeIncreasing(int[] nums) {
        int modify = 0;
        int n = nums.length;
        if(nums[0] > nums[1]){
            nums[0] = nums[1]/2;
            modify++;
        }
        for(int i = 1 ; i < n ; i++){
            if((nums[i-1] < nums[i] && nums[i+1] < nums[i]) ||
                    (nums[i-1] > nums[i] && nums[i+1] > nums[i])){
                nums[i] = (nums[i-1] + nums[i+1])/2;
                if(nums[i] == nums[i-1] || nums[i] == nums[i+1]){
                    return false;
                }
                modify++;
            }
        }
        if(nums[n-1] < nums[n-1]){
            modify++;
        }
        return modify < 1;
    }*/

    /*public static List<Integer> countSmaller(int[] nums) {
        List<Integer> smallerList = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            int count = 0;
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            smallerList.add(count);
        }
        return smallerList;
    }*/


    /*public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        for (int i = 1; i <= n; i++)
            parent.add(i);

        List<Integer> ans = new ArrayList<>();

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            if (find_parent(x) != find_parent(y)) {
                union_find(x, y);
            } else {
                ans.add(x);
                ans.add(y);
                break;
            }
        }
        return ans;
    }

    int find_parent(int x) {
        if (x != parent[x])
            parent[x] = find_parent(parent[x]);
        return parent[x];
    }

    void union_find(int x, int y) {
        int a = find_parent(x);
        int b = find_parent(y);
        if (sz.get(a) < sz.get(b))
            swap(a, b);
        parent.get(b) = a;
        sz[a] += sz[b];
    }*/

    /*public static String minRemoveToMakeValid(String s) {
        Stack<Pair<Character, Integer>> parenthesis = new Stack<>();
        HashSet<Integer> indexRemoval = new HashSet<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(parenthesis.isEmpty()) {
                    indexRemoval.add(i);
                    continue;
                }
                Pair<Character, Integer> p = parenthesis.peek();
                if(p.getKey() == '(') {
                    parenthesis.pop();
                } else {
                    indexRemoval.add(i);
                }
            } else if( s.charAt(i) == '(') {
                parenthesis.push(new Pair<>('(', i));
            }
        }

        while(!parenthesis.isEmpty()) {
            indexRemoval.add(parenthesis.pop().getValue());
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++) {
            if(!indexRemoval.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }*/

   /* public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if(startRow < 0 || startColumn < 0 || startRow >= m || startColumn >= n){
            return 1;
        }
        if (maxMove <= 0) {
            return 0;
        }

        String key = startRow + " " + startColumn;
        if (pathMap.containsKey(key)) {
            return pathMap.get(key);
        }

        int count = 0;
        count = count % mod + findPaths(m, n, maxMove - 1, startRow-1, startColumn) % mod;
        count = count % mod + findPaths(m, n, maxMove - 1, startRow+1, startColumn) % mod;
        count = count % mod + findPaths(m, n, maxMove - 1, startRow, startColumn-1) % mod;
        count = count % mod + findPaths(m, n, maxMove - 1, startRow, startColumn+1) % mod;

        pathMap.put(key,count % mod);
        return pathMap.get(key);
    }*/



    /*public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for(int i = 0 ; i < words.length ; i++){
            if(matchingSubsequence(s,words[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean matchingSubsequence(String s, String word) {
        int i = 0 , j = 0;
        if(wordMap.containsKey(word)){
            return wordMap.get(word);
        }
        while(j < word.length() && i < s.length()){
           if(s.charAt(i) == word.charAt(j)){
               i++;
               j++;
           } else{
              i++;
           }
        }
        if(j == word.length()){
            wordMap.put(word,true);
            return true;
        }
        wordMap.put(word,false);
        return false;
    }*/


    /*public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<>();
        if(numRows <= 0){
            return pascalList;
        }
        pascalList.add(Arrays.asList(1));
        if(numRows == 1){
            return pascalList;
        }
        pascalList.add(Arrays.asList(1,1));
        if(numRows == 2){
            return pascalList;
        }
        for(int i = 2 ; i < numRows ; i++){
            List<Integer> iterativeList =  new ArrayList<>();
            List<Integer> prevList = pascalList.get(i-1);
            iterativeList.add(1);
            for(int j = 1; j < prevList.size();j++){
                iterativeList.add(prevList.get(j-1) + prevList.get(j));
            }
            iterativeList.add(1);
            pascalList.add(iterativeList);
        }
    return pascalList;
    }*/


    /*public static int[] sortArrayByParity(int[] nums) {
        int[] finalArray = new int[nums.length];
        int[] oddArray = new int[nums.length];
        int i = 0;
        int j = 0;
        for(int num : nums){
            if(num % 2 == 0){
                finalArray[i] = num;
                i++;
            } else{
                oddArray[j++] = num;
            }
        }
        for(int k = 0 ; k < j ; k++){
            finalArray[i] = oddArray[k];
            i++;
        }
        return finalArray;
    }*/

    /*public static int hammingDistance(int x, int y) {
        String b1 = Integer.toBinaryString(x);
        String b2 = Integer.toBinaryString(y);
        String appender = "";
        for(int i = 0 ; i < 32-b1.length() ; i++){
            appender = appender+"0";
        }
        b1 = appender + b1;
        appender = "";
        for(int i = 0 ; i < 32-b2.length() ; i++){
            appender = appender+"0";
        }
        b2 = appender + b2;

        int i = 0 , count = 0;
        while(i < b1.length()){
            if(b1.charAt(i) != b2.charAt(i)){
                count++;
            }
            i++;
        }
        return count;
    }*/

    /*public static int kInversePairs(int n, int k) {
        int[][] t = new int[n+1][k+1];
        long m =  1000000007;
        for(int i = 0 ; i < t.length ; i++){
            Arrays.fill(t[i],0);
        }
        for(int i=0;i<=n;i++)
        {
            t[i][0] = 1;
        }
        t[0][0] = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(j>=i)
                {
                    t[i][j] = (int)(((t[i][j-1]) + (t[i-1][j]) - (t[i-1][j-i]) + m)%m);
                }
                else
                {
                    t[i][j] = (int)(((t[i][j-1])%m + (t[i-1][j])%m)%m);

                }
            }
        }
        return t[n][k];
    }*/

    /*public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }
    static int count(int[] nums, int bound) {
        int ans = 0, cur = 0;
        for (int x : nums) {
            cur = x <= bound ? cur + 1 : 0;
            ans += cur;
        }
        return ans;
    }*/


    /*public static List<String> generateParenthesis(int n) {
        String output = "";
        int open = n , close = n;
        list.clear();
        generateBalancedParanthesis(open , close , output);
        return list;
    }
    public static void generateBalancedParanthesis(int open , int close ,String output) {
        if(open == 0 && close == 0){
            list.add(output);
            return;
        }

        if(open != 0){
            String output1 = output;
            output1 = output1 + "(";
            generateBalancedParanthesis(open-1,close,output1);
        }
        if(close > open){
            String output2 = output;
            output2 = output2 + ")";
            generateBalancedParanthesis(open,close-1,output2);
        }

    }*/

    /*public static int numTimesAllBlue(int[] light) {
        String[] bulb = new String[light.length];
        Arrays.fill(bulb,"Off");
        int count = 0;
        for(int i = 0 ; i < light.length ; i++){
            int position = light[i] - 1;
            boolean blueFlag = true;
            for(int j = 0 ; j < bulb.length ; j++){
                if(j < position && bulb[j] == "Off"){
                    blueFlag = false;
                    break;
                }
            }
            if(blueFlag) {
                for (int j = 0; j <= position; j++) {
                    bulb[j] = "Blue";
                }
            } else{
                bulb[position] = "On";
            }
            if(checkForAllBlue(bulb)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkForAllBlue(String[] bulb) {
        for(int i = 0 ; i < bulb.length ; i++){
            if(bulb[i] == "On"){
                return false;
            }
        }
    }*/

}