class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int pivot = start + (end-start)/2;
            if(nums[pivot] == target){
                return pivot;
            }
            if(target < nums[pivot]){
                end = pivot - 1;
            }else{
                start = pivot + 1;
            }
        }
        return start;
    }
}