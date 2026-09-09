package N150.TwoPointers.TwoSumII_002;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] list = Solution.twoSum(new int[] {2,7,11,15},9);
        Arrays.stream(list).forEach(System.out::println);
        System.out.println("-----------");
        int[] list2 = Solution.twoSum(new int[] {2,3,4},6);
        Arrays.stream(list2).forEach(System.out::println);
        System.out.println("--------");
        int[] list3 = Solution.twoSum(new int[] {-1,0},-1);
        Arrays.stream(list3).forEach(System.out::println);

        System.out.println("--------");
        int[] list4 = Solution.twoSum(new int[] {3,24,50,79,88,150,345},200 );
        Arrays.stream(list4).forEach(System.out::println);
    }
}

class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int leftI = 0; int rightI=numbers.length-1;

        while(leftI < rightI){
            if(numbers[leftI] + numbers[rightI] < target){
                leftI++;
            }
            else if(numbers[leftI] + numbers[rightI] > target){
                rightI--;
            }
            else
                return new int[]{leftI+1,  rightI+1};
        }
        return new int[]{};
    }
}




//class Solution {
//    public static int[] twoSum(int[] numbers, int target) {
//        int leftI; int rightI=numbers.length-1;
//
//        for (int i=0 ; i<numbers.length; i++){
//            int firstNum = numbers[i];
//            int diff = target - firstNum;
//            leftI=i+1;
//            while(leftI <= rightI){
//                int middle = (rightI + leftI) /2;
//                if(numbers[middle] < diff){
//                    leftI = middle+1;
//                    continue;
//                }
//                else if (numbers[middle] > diff){
//                    rightI = middle-1;
//                    continue;
//                }
//                else{
//                    return new int[] {i+1, middle+1};
//                }
//
//            }
//        }
//        return new int[]{};
//    }
//}
//

//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> maps = new HashMap<>();
//
//        for(int i =0; i< numbers.length; i++){
//            int gap = target - numbers[i];
//            if(!maps.containsKey(gap))
//                maps.put(numbers[i], i );
//            else
//                return new int[] {maps.get(gap)+1,i+1};
//        }
//        return new int[] {};
//    }
//}
