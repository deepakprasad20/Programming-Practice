/*
* Rotation of a square matrix anticlockwise
* */

public class MatrixRotation {
    public static void main(String[] args){
        int[][] mat = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        rotateMatrix(mat);
    }

    private static void rotateMatrix(int[][] mat) {
        //calculate transpose
        System.out.println("Actual matrix");
        print(mat);
        for(int i = 0 ; i < mat.length;i++){
            for(int j = i ; j < mat[0].length ; j++){
                //swap values of i,j with j,i when i != j
                if(i != j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        System.out.println("Transpose of matrix");
        print(mat);

        // Rotate anticlockwise
        for(int i = 0 ; i < mat[0].length;i++){
            int start = 0, end = mat.length-1;
            while(start < end){
                int tmp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = tmp;
                start++;
                end--;
            }
        }

        System.out.println("Rotated matrix");
        print(mat);
    }


    private static void print(int[][] mat) {
        for(int i = 0 ; i < mat.length;i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
