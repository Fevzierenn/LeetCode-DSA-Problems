package N150.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int gap = target - nums[i];
            if(!maps.containsKey(gap))
                maps.put(nums[i], i );
            else
                return new int[] {maps.get(gap),i};
        }
        return new int[] {};
    }
}
