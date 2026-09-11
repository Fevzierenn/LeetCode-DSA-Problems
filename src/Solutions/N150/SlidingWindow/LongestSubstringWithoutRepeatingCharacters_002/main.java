package N150.SlidingWindow.LongestSubstringWithoutRepeatingCharacters_002;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
    }
}

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        String maksSub= "";
        int left = 0;
        int right = 1;

        Set<Integer> setC = new HashSet<>();
        while ( right<s.length()+1){
            String subs = s.substring(left,right);
            setC.clear();
            subs.chars().forEach(m -> setC.add(m));
            boolean isUnique = subs.length() == setC.size();
            if(isUnique){
                if(maksSub.length() < subs.length())
                    maksSub = subs;
                right++;
            }
            else{
                left++;

            }

        }
        System.out.println("maks: "+ maksSub);
        return maksSub.length();
    }
}
