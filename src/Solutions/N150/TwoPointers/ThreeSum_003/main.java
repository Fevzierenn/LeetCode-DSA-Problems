package N150.TwoPointers.ThreeSum_003;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<List<Integer>> list1=Solution.threeSum(new int[] {-1,0,1,2,-1,-4} );
        List<List<Integer>> list2=Solution.threeSum(new int[] {0,1,1} );
        List<List<Integer>> list3=Solution.threeSum(new int[] {0,0,0,0} );

        list1.stream().forEach(System.out::println);
        System.out.println("---------");
        list2.stream().forEach(System.out::println);
        System.out.println("---------");
        list3.stream().forEach(System.out::println);

    }
}

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        //{-1,0,1,2,-1,-4}
        //{-4,-1,-1,0,1,2}
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        Set<List<Integer>> list = new HashSet<>();
        int leftI, rightI, pointerI = 0;
        while (pointerI < sortedNums.length - 2) {
            leftI = pointerI + 1;
            rightI = sortedNums.length - 1;
            int searchingNum = -(sortedNums[pointerI]);
            while (leftI < rightI)
            {
                if (sortedNums[leftI] + sortedNums[rightI] > searchingNum)
                    rightI--;
                else if (sortedNums[leftI] + sortedNums[rightI] < searchingNum)
                    leftI++;
                else
                {
                    List ans = List.of(sortedNums[pointerI], sortedNums[leftI], sortedNums[rightI]);
                    list.add(ans);
                    leftI++;
                }
            }
                pointerI++;
            }
            return list.stream().toList();
        }
    }
