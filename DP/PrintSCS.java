package DP;

public class PrintSCS {
    public static void main(String[] args){
        String a = "abcdaf";
        String b = "acbcf";
        System.out.println("Shortest Common Supersequence : " + scs(a,b,a.length(),b.length()));
    }

    private static String scs(String a, String b, int m, int n) {
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
                if(a.charAt(i-1) == b.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
         int i = m , j = n;
        StringBuffer sb = new StringBuffer("");
        while(i > 0 && j > 0){
            if(a.charAt(i-1) == b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            } else{
                if(t[i-1][j] > t[i][j-1]){
                    sb.append(a.charAt(i-1));
                    i--;
                } else{
                    sb.append(b.charAt(j-1));
                    j--;
                }
            }
        }
        while(i > 0){
            sb.append(a.charAt(i-1));
            i--;
        }
        while(j > 0){
            sb.append(b.charAt(j-1));
            j--;
        }
       return sb.reverse().toString();
    }
}
