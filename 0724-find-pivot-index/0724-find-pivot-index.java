class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int index = -1;
        //[1,7,3,6,5,6]
        //[1,8,11,17,22,28]
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        if(sum - nums[0] == 0){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            if(sum-nums[i] == nums[i-1]){
                if(index == -1){
                    index = i;
                }else{
                    index = i < index ? i : index;
                }
            }
        }
        return index;
    }
}