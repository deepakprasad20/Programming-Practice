public class LetterCasePermutation {
    public static void main(String[] args){
        String input = "a1B2";
        String output = "";
        solve(input , output);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            System.out.print(output + " ");
            return;
        }
        if(Character.isDigit(input.charAt(0))){
            String output1 = output;
            output1 = output1 + input.charAt(0);
            input = input.substring(1);
            solve(input,output1);
        } else {
            String output1 = output;
            String output2 = output;
            output1 = output1 + Character.toLowerCase(input.charAt(0));
            output2 = output2 + Character.toUpperCase(input.charAt(0));
            input = input.substring(1);
            solve(input,output1);
            solve(input,output2);
        }
    }
}
