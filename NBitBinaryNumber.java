/*
* This programme is for printing N digit binary number whose count of Zero's is always greater than
* or equal to the count of One's as prefix;
*
* for eg: N = 3
* so the required output will 111,110,101,
* since 011 will not be considered as output because when we check number of zero's and One's
* for all prefix of Zero and One then it will not satisfy the above condition
* 011 1st prefix
* 01 second prefix
* 0 third prefix which violates the above codition.
* */
public class NBitBinaryNumber {
    public static void main(String[] args){
        int n = 3, one = 0 , zero = 0;
        String output = "";
        printNBitBinaryNumber(n,one,zero,output);
    }

    private static void printNBitBinaryNumber(int n, int one, int zero,String output) {
        if(n == 0){
            System.out.print(output + ", ");
            return;
        }
        String output1 = output;
        output1 = output + "1";
        printNBitBinaryNumber(n-1,one+1,zero,output1);

        if(one > zero){
            String output2 = output;
            output2 = output2 + "0";
            printNBitBinaryNumber(n-1,one,zero+1,output2);
        }
    }
}
