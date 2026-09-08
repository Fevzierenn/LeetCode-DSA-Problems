package N150.Arrays_Hashing.ContainsDuplicate_001;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */


import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Boolean containsDuplicate=Solution.containsDuplicate(new int[]{3,3});
        System.out.println(containsDuplicate);
    }
}

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set numsSet = new HashSet();
        for (int i : nums)
            numsSet.add(i);
        return nums.length != numsSet.size();
    }
}

//public static boolean containsDuplicate(int[] nums) {
//    Map<Integer, Boolean> duplicateMap = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//        if(duplicateMap.containsKey(nums[i]))
//            return true;
//        duplicateMap.put(nums[i], true);
//    }
//    return false;
//}