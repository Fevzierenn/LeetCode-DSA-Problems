public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] timesArr = new int[nums.length];
        int countZeros=0;
        int times = 1;
        for(int num : nums){
            if(num == 0)
                countZeros++;
            else
                times *= num;}

        for(int i = 0; i < nums.length;i++){

            if(countZeros >=2)
                timesArr[i] = 0;

            else if(countZeros == 1){
                if(nums[i] == 0){
                    timesArr[i]= times;
                }
                else{
                    timesArr[i] =0;
                }
            }
            else{
                timesArr[i]= times/nums[i];
            }
        }

        return timesArr;
    }
}
