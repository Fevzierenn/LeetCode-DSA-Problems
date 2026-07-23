package Arrays_Hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    static void main() {
        System.out.println("HashMap / Frequency Counting");

        System.out.println(isAnagram("anagram","garamna"));
        System.out.println(isAnagram("car","cat"));
        System.out.println(isAnagram("aacc","ccac"));
        System.out.println(isAnagram("aacc","ccaa"));
    }

        public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> maps = new HashMap<>();
        for (int i=0 ; i < s.length(); i++){
            Character c = s.charAt(i);
            maps.put(c, maps.getOrDefault(c,0)+1);
        }

        for (int i=0 ; i < t.length(); i++){
            Character c = t.charAt(i);
            if(!maps.containsKey(c)  ) return false;
            maps.put(c, maps.getOrDefault(c,0)-1);
        }
        return maps.values().stream().mapToInt(Integer::intValue).noneMatch(k -> k != 0);
    }
}
