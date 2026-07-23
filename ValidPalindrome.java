package TwoPointers;

public class ValidPalindrome {
    static void main() {
        System.out.println("Two Pointers and Regex to clean ");

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));

    }

    public static boolean isPalindrome(String s) {
        char[] result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray() ;
        int i=0; int j=result.length-1;
        while(i <= j){
            if(result[i++] == result[j--]);
            else return false;
        }
        return true;
    }


}
