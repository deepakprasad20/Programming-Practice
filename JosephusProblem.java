/*
*
*  */
import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args){
        int n = 8 , k = 3, index = 0;
        List<Integer> peoplelist = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            peoplelist.add(i);
        }
        k = k-1;
        System.out.println("Last remaining people is at index : " + findLastPeople(peoplelist,k,index));
    }

    private static int findLastPeople(List<Integer> peoplelist, int k,int index) {
        if(peoplelist.size() == 1){
            return peoplelist.get(0);
        }
        index = (index + k) % peoplelist.size();
        peoplelist.remove(index);
        return findLastPeople(peoplelist,k,index);
    }
}
