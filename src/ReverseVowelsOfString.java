import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ReverseVowelsOfString {


    public String reverseVowels(String s) {
        Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u',
                                'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !VOWELS.contains(chars[left])) {
                left++;
            }
            while (left < right && !VOWELS.contains(chars[right])) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
        return new String(chars);
    }






//    public String reverseVowels(String s) {
//        Set<Character> vowelsList = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
//        StringBuilder s1 = new StringBuilder(s);
//        int leftIndex =0;
//        int rightIndex = s.length()-1;
//        while(leftIndex < rightIndex ){
//            if(!vowelsList.contains(s1.charAt(leftIndex)))
//                leftIndex++;
//            if(!vowelsList.contains(s1.charAt(rightIndex)))
//                rightIndex--;
//            if (vowelsList.contains(s1.charAt(leftIndex)) && vowelsList.contains(s1.charAt(rightIndex)))
//            {
//                Character leftValue = s1.charAt(leftIndex);
//                Character rightValue = s1.charAt(rightIndex);
//                if(!Pattern.matches("[a-zA-Z]+", leftValue.toString()))
//                    leftIndex++;
//                if(!Pattern.matches("[a-zA-Z]+", rightValue.toString()))
//                    rightIndex--;
//                else{
//                    s1.setCharAt(leftIndex, rightValue);
//                    s1.setCharAt(rightIndex, leftValue);
//                    leftIndex++;
//                    rightIndex--;
//                }
//
//            }
//        }
//
//        return s1.toString();
//    }
}

