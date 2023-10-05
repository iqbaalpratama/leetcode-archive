class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int num : nums){
            if(!mapCount.containsKey(num)){
                mapCount.put(num,1);
            }else{
                mapCount.put(num, mapCount.get(num)+1);
            }
        }
        List<Integer> result = mapCount.entrySet().stream()
        .filter(e -> e.getValue() > nums.length / 3)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        return result;
    }
}