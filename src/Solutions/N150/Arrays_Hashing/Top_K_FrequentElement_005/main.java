package N150.Arrays_Hashing.Top_K_FrequentElement_005;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        int[] list = Solution.topKFrequent(new int[]{1,1,1,2,2,3,2,3,2,3,1,2,2},2);
        Arrays.stream(list).forEach(System.out::println);
        System.out.println("---------------");
        int[] list2 = Solution.topKFrequent(new int[]{3,0,1,0},1);
        Arrays.stream(list2).forEach(System.out::println);
    }
}

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> maps = new HashMap<>();
        for (Integer num : nums)
            maps.put(num, maps.getOrDefault(num,1)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(
                (a,b) -> a.getValue()-b.getValue()  //SMALL TO BIGGER
        );
        for (Map.Entry<Integer, Integer> value: maps.entrySet())
            queue.offer(value);
        int size = queue.size();;
        for(int i=0; i<size-k;i++)
            queue.poll();
        return queue.stream().mapToInt(m -> m.getKey()).toArray();
    }
}
//
//
//class Solution {
//    public static int[] topKFrequent(int[] nums, int k) {
//        int[] topK = new int[k];
//        Map<Integer,Integer> maps = new HashMap<>();
//        for (Integer num : nums){
//            if(!maps.containsKey(num))
//                maps.put(num,1);
//            else
//                maps.put(num, maps.get(num)+1);
//        }
//        Object[] topKeys = maps.entrySet().stream()
//                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .limit(k)
//                .map(Map.Entry::getKey)
//                .toArray(Object[]::new);
//        for(int i=0; i<k;i++)
//            topK[i] = (int) topKeys[i];
//        return topK;
//    }
//}
