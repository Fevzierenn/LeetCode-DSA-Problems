package N150.GroupAnagrams_004;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List solution = Solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        solution.forEach(System.out::println);
    }
}


class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStr = new String[strs.length];
        for(int i=0; i< strs.length; i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            sortedStr[i] = new String(word);
        }
        Map<String, List<String>> maps = new HashMap<>();

        int index=0;
        for(String s : sortedStr){
            if(maps.containsKey(s)){
                List<String> list =maps.get(s);
                list.add(strs[index++]);
                maps.put(s, list);
            }
            else{
                ArrayList<String> list = new ArrayList();
                list.add(strs[index++]);
                maps.put(s, list);
            }
        }
        return maps.values().stream()
                .sorted(Comparator.comparingInt(m-> m.size()))
                .toList();
    }
}