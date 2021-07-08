package DP;

public class ScrambledString {
    public static void main(String[] args){
        String a = "wegrat";
        String b = "gratew";
        System.out.println("String " + a + " is scrambled to string " + b + " : " + solve(a,b));
    }

    private static boolean solve(String a, String b) {
        /*if(a.length() != b.length()){
            return false;
        }*/
        if(a.equals(b)){
            return true;
        }
        if(a.length() <= 1){
            return false;
        }
        boolean condition1 = false ,flag = false;
        boolean condition2 = false;
        int n = a.length();
        for(int i = 1 ; i <= n-1 ; i++){
             condition1 = solve(a.substring(0,i) , b.substring(n-i)) &&
                                    solve(a.substring(i,n) , b.substring(0,n-i));
             condition2 = solve(a.substring(0,i) , b.substring(0,i)) &&
                                    solve(a.substring(i,n),b.substring(i,n));
             if(condition1 || condition2){
                 flag = true;
                 break;
             }
        }
        return flag;
    }
}
