/*
* this programme is used to find kth index of grammar with given line i.e, n
* for n == 1 and k == 1 grammar will be 0
* and in next line 0 will be converted to 01 and 1 will be converted to 10
*
* for eg. n=3 and k = 3 the matrix will be
*       k=1 k=2 k=3 k=4
* n=1   0
* n=2   0   1               -> (0 is converted to 0 and 1)
* n=3   0   1   1   0       -> (first 0 is converted to (0 and 1) and 2nd 1 is converted to (1 and 0)).
* so answer for n = 3 and k = 3 is 1
* */
public class Recursion6 {
    public static void main(String[] args){
        int n = 5, k = 14;
        System.out.println(k+"th index of grammar with length " + n +" is : " + solve(n,k));
    }

    private static int solve(int n, int k) {
        if(n == 1 && k==1){
            return 0;
        }
        int length = (int) Math.pow(2,n-1);
        int mid = length/2;
        if(k <= mid){
           return solve(n-1,k);
        } else{
            return solve(n-1,k-mid) == 0 ? 1 : 0;
        }

    }
}
