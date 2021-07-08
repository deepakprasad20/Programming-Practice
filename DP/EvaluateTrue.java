package DP;

import java.util.HashMap;
import java.util.Map;

public class EvaluateTrue {
    public static Map<String , Integer> mp = new HashMap<>();
    public static void main(String[] args){
        String exp = "T^F&T";
        mp.clear();
        System.out.println(evaluateTrueExpression(exp,0,exp.length()-1,true));
    }

    private static int evaluateTrueExpression(String exp, int i, int j , boolean isTrue) {
        if(i > j){
            return 0;
        } else if(i == j){
            if(isTrue){
                return exp.charAt(i)== 'T' ? 1 : 0 ;
            } else{
                return exp.charAt(i) == 'F' ? 1 : 0;
            }
        }
        String key = i + " " + j + " " + isTrue;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        int ans = 0;
        for(int k = i+1 ; k < j-1 ; k=k+2){
            int lt = evaluateTrueExpression(exp,i,k-1,true);
            int lf = evaluateTrueExpression(exp,i,k-1,false);
            int rt = evaluateTrueExpression(exp,k+1,j,true);
            int rf = evaluateTrueExpression(exp,k+1,j,false);

            if(exp.charAt(k) == '&'){
                if(isTrue){
                    ans = ans + (lt * rt);
                } else{
                    ans = ans + (lt *rf) + (lf*rt) + (lf*rf);
                }

            } else if(exp.charAt(k) == '|'){
                if(isTrue){
                    ans = ans + (lt * rt) + (lt *rf) + (lf*rt);
                } else{
                    ans = ans + (lf*rf);
                }

            } else if(exp.charAt(k) == '^'){
                if(isTrue){
                    ans = ans  + (lt *rf) + (lf*rt);
                } else{
                    ans = ans + (lf*rf) + (lt * rt);
                }
            }
        }
        mp.put(key,ans);
        return ans;
    }
}
