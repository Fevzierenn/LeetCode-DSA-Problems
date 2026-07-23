package Arrays_Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main() {
        System.out.println("Pattern: Hash Map (Lookup Table)");
        System.out.println(twoSum(new int []{2,7,11,15},9));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer > maps = new HashMap<>();
        for(int i = 0 ; i< nums.length;i++){
            int subst = target - nums[i];
            if(maps.get(subst) != null ) {
                return new int [] { maps.get(subst), i};
            }
            maps.put(nums[i],i);
        }
        return new int[] {1,23,24,25};
    }
}
