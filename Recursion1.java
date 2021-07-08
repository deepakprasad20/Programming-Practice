public class Recursion1 {
    public static void main(String[] args){
        int n = 30;
        solve(n);
    }

    private static void solve(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        solve(n-1);

    }
}
