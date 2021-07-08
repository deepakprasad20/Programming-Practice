public class PrintSmallest {
    public static void main(String[] args){
        int[] arr = {5,6,2,9,21,1};
        int N = arr.length;
        printSmallest(N , arr);
    }

    private static void printSmallest(int n, int[] arr) {
        for(int i = 0 ; i < n;i++){
            for(int j = i +1 ; j < n; j++){
                //swap values of i,j with j,i when i != j
                if(compare(arr[i],arr[j]) > 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    private static int compare(int i, int i1) {
        String a = Integer.toString(i);
        String b = Integer.toString(i1);
        return (a+b).compareTo(b+a);
    }
    private static void print(int[] mat) {
        for(int i = 0 ; i < mat.length;i++){
                System.out.print(mat[i]);
        }
    }
}
