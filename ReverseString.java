public class ReverseString {
    public static void main(String[] args){
        String str = "All you need is love";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        int k = str.indexOf(" ");
        return k == -1 ? str : reverseString(str.substring(k + 1)) + " " + str.substring(0, k);
    }
}
