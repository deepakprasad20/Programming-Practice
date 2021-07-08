/*
* This programme is for generating balanced paranthesis for a given integer n.
*
* for eg: if n =2;
* op : ()(), (())
* */
public class BalancedParanthesis {
    public static void main(String[] args){
        int n = 3;
        int open = n;
        int close = n;
        String output = "";
        generateBalancedParanthesis(open,close,output);
    }

    private static void generateBalancedParanthesis(int open, int close, String output) {
        if(open == 0 && close == 0){
            System.out.print(output + ", ");
            return;
        }
        if(open != 0){
            String output1 = output;
            output1 = output1 + "(";
            generateBalancedParanthesis(open-1,close,output1);
        }
        if(close > open){
            String output2 = output;
            output2 = output2 + ")";
            generateBalancedParanthesis(open,close-1,output2);
        }
    }
}
