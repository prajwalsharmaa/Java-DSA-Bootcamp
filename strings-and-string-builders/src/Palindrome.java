import java.util.Arrays;

public class Palindrome {
    static void main() {
        String str = "Palpaplap";
        System.out.println(checkPalindrome(str));
    }
    static boolean checkPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }

        }
        return true;
    }
}
