/*
* This programme is used to print all the subset of given input string.
*
* for eg. : input : "ab" , output : " " , "a" , "b" , "ab";
*
* */
public class PrintSubset {
    public static void main(String[] args){
        String input = "abcd",output = "";
        solve(input,output);
    }

    private static void solve(String input, String output) {
        if(input.length() == 0){
            System.out.print(output + " ");
            return;
        }

        String output1 = output;
        String output2 = output;
        output2 = output2 + input.charAt(0);
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);
    }
}
