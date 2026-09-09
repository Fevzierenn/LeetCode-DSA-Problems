package N150.TwoPointers.ValidPalindrome_001;

public class main {
    public static void main(String[] args) {
        boolean isPalindrome = Solution.isPalindrome( "A man, a plan, a canal: Panama");
        System.out.println(isPalindrome);

        boolean isPalindrome2 = Solution.isPalindrome( "race a car");
        System.out.println(isPalindrome2);
    }
}
class Solution {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        int leftI=0; int rightI=arr.length-1;
        while(leftI < rightI)
        {
            if(arr[leftI] != arr[rightI])
                return false;
            leftI++;
            rightI--;
        }
        return true;
    }
}
