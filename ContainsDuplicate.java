package Arrays_Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    static void main() {

        System.out.println(containsDuplicate(new int[]{1,2,3,4}));  //false
        System.out.println(containsDuplicate(new int[]{1,2,3,4,1})); //true
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums)
            set.add(i);
        return set.size() != nums.length;

//        Map<Integer, Integer> maps = new HashMap<>();
//        for (Integer i : nums)
//            maps.put(i, maps.getOrDefault(i,0)+1);
//        return maps.values().stream().mapToInt(Integer::intValue).anyMatch(k -> k != 1);
    }

}
