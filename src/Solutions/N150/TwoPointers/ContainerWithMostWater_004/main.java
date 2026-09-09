package N150.TwoPointers.ContainerWithMostWater_004;

public class main {
    public static void main(String[] args) {
        System.out.println(Solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(Solution.maxArea(new int[]{1,2,1}));

    }
}

class Solution {
    public static int maxArea(int[] height) {
        int leftI = 0;
        int rightI = height.length-1;
        int maks = 0;
        while(leftI < rightI){
            int smallest = height[leftI] > height[rightI] ? height[rightI] : height[leftI];
            int calculation = smallest * (rightI - leftI);
            if(calculation > maks)
                maks = calculation;

            if(height[leftI] < height[rightI])
                leftI++;
            else
                rightI--;
        }
        return maks;
    }
}