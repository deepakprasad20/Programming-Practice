public class CombinationWithSpaces {
    public static void main(String[] args){
        String input = "ABC";
        String output = String.valueOf(input.charAt(0));
        input = input.substring(1);
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
        output2 = output2 + "_" + input.charAt(0);
        input = input.substring(1);
        solve(input,output1);
        solve(input,output2);
    }
}
