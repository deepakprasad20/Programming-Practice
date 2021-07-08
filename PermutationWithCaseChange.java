/*
* this programme is to find permutations of given string with a combination of uppercase and lowercase:
*
* for eg. : input = "ab"
* output : "ab" , "aB" , "Ab" , "AB"
*
* assumption input string will always be in lower case.
* */
public class PermutationWithCaseChange {
    public static void main(String[] args){
        String input = "ab";
        String output = "";
        solve(input,output);
    }

    private static void solve(String input, String output) {
        if(input.length() == 0){
            System.out.print(output + " ");
            return;
        }
        String output1 = output;
        String output2 = output;
        output1 = output1 + input.charAt(0);
        output2 = output2 + Character.toUpperCase(input.charAt(0));
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);
    }
}
