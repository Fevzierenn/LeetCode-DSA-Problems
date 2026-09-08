package N150.Arrays_Hashing.Top_K_FrequentElement_005;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] list = Solution.topKFrequent(new int[]{1,1,1,2,2,3,2,3,2,3,1,2,2},2);
        Arrays.stream(list).forEach(System.out::println);
    }
}

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] topK = new int[k];
        Map<Integer,Integer> maps = new HashMap<>();
        for (Integer num : nums){
            if(!maps.containsKey(num))
                maps.put(num,1);
            else
                maps.put(num, maps.get(num)+1);
        }
        Object[] topKeys = maps.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toArray(Object[]::new);
        for(int i=0; i<k;i++)
            topK[i] = (int) topKeys[i];
        return topK;
    }
}
