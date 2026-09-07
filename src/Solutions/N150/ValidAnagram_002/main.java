package N150.ValidAnagram_002;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        boolean anagram1 = Solution.isAnagram("anagram","nagaram");
        boolean anagram2 = Solution.isAnagram("rat","car");
        boolean anagram3 = Solution.isAnagram("mmuıortuaaoo","mmuaortuaaoo");

        System.out.println(anagram1);
        System.out.println(anagram2);
        System.out.println(anagram3);

    }

}

class Solution {
    public static boolean isAnagram(String s, String t) {
        StringBuilder strB = new StringBuilder(s);
        char[] arrT = t.toCharArray();

        for(Character c : arrT){
            int index= strB.indexOf(c.toString());
            if(index == -1) return false;
            strB.replace(index, index+1, "");
        }
        return true;
    }

}

//public static boolean isAnagram(String s, String t) {
//    if(s.length() != t.length()) return false;
//    Map<Character, Integer> anagramMap = new HashMap<>();
//    for(Character c : s.toCharArray()){
//        if(anagramMap.containsKey(c))
//            anagramMap.put(c, anagramMap.get(c)+1);
//        else
//            anagramMap.put(c,1);
//    }
//
//    for(Character c : t.toCharArray()){
//        if(anagramMap.containsKey(c))
//            anagramMap.put(c, anagramMap.get(c)-1);
//        else
//            return false;
//    }
//
//    return anagramMap.values().stream().filter(m -> m != 0).count() == 0;
//
//}