class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        Arrays.sort(nums);

        if(nums[0] * nums[1] * nums[nums.length-1] > nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]){
            return nums[0] * nums[1] * nums[nums.length-1];
        }
        return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    }
}