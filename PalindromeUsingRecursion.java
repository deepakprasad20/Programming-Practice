public class PalindromeUsingRecursion {
    public static void main(String[] args){
        String input = "12213";
        String output = "";
        System.out.println(findPalindrome(input,output));
    }

    private static String findPalindrome(String input, String output) {
        if(input.equals("")){
            return output;
        }
        String output1 = output;
        output1 = output1 + input.charAt(input.length()-1);
        input = input.substring(0,input.length()-1);
        return findPalindrome(input,output1);
    }
}
