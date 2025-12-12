public class MoveZeroes {
    public void moveZeroes1(int[] nums) {
        int index=1;
        while(index < nums.length){
            if(index==0)
                index++;
            if(nums[index-1] == 0 && nums[index] != 0){//shifting
                nums[index-1] = nums[index];
                nums[index] = 0;
                index--;
            }
            else
                index++;
        }
    }
}
