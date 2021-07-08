package DP;

public class PrintLCS {
    public static void main(String[] args){
        String x= "abdefh";
        String y = "abch";
        System.out.println("Length of longest common subsequence is : " + findLcs(x,y,x.length(),y.length()));
    }

    private static String findLcs(String x, String y, int m, int n) {
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i < m+1 ; i++){
            for(int j = 0 ; j < n+1 ; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < m+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(x.charAt(m-1) == y.charAt(n-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else{
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }
        int i = m , j = n;
        StringBuffer sb = new StringBuffer("");
        while(i > 0 && j > 0){
            if(x.charAt(i-1) == y.charAt(j-1)){
                sb.append(x.charAt(i-1));
                i--;
                j--;
            } else{
                if(t[i-1][j] > t[i][j-1]){
                    i--;
                } else{
                    j--;
                }
            }
        }
        return sb.reverse().toString();
    }
}
