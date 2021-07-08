import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args){
        int n = 5 ;
        System.out.println(findPascalRow(n));
    }

    private static List<Integer> findPascalRow(int n) {
        if(n == 1){
            return Arrays.asList(1);
        } else if(n == 2){
            return Arrays.asList(1,1);
        }
        List<Integer> prevList = findPascalRow(n-1);
        List<Integer> current = new ArrayList<>();
        current.add(1);
        for(int i = 1 ; i < prevList.size() ; i++){
            current.add(prevList.get(i-1) + prevList.get(i));
        }
        current.add(1);
        return current;
    }
}
