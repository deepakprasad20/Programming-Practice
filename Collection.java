import java.util.*;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String...k){
        /*Map<Integer,String> hm = new HashMap<>();
        hm.put(10,"deepak");
        hm.put(20,"deepa");
        hm.put(30,"deep");
        hm.put(10,"dee");
        for(Map.Entry entry : hm.entrySet()){
            System.out.println("Key = " + entry.getKey() + " ,value = " + entry.getValue());
        }*/
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);
        //arrList.stream().filter(x->x%2==0).forEach(System.out::println);
        List<Integer> evenList = arrList.stream().filter(x-> x%2==0).collect(Collectors.toList());
        System.out.println(evenList);
        List<Integer> oddList = arrList.stream().filter(x-> x%2!=0).collect(Collectors.toList());
        System.out.println(oddList);
        int sum = arrList.stream().reduce(Integer::sum).get();
        System.out.println(sum);
        int sum1 = arrList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);
        String word = "Dpk";
        System.out.println(stringContainsVowels(word));
        System.out.println("list contains only odd numbers? " + onlyOddNumbers(arrList));

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll1);
    }
    public static boolean stringContainsVowels(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    public static boolean onlyOddNumbers(List<Integer> list) {
        if(list.stream().filter(x -> x%2 == 0).findFirst().isPresent()){
            return false;
        }
        return true;
    }
}
