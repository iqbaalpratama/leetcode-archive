class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int num : nums){
            if(result.containsKey(num)){
                result.remove(num);
            } else{
                result.put(num, 1);
            }
        }
        for (Integer i : result.keySet()) {
            return i;
        }
        return 0;
    }
}