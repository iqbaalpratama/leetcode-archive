class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> flag = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(flag.containsKey(nums[i])){
                return true;
            }
            flag.put(nums[i],1);
        }
        return false;
    }
}