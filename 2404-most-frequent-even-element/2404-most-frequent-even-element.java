class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> mapCount = new HashMap<>();
        for(int num : nums){
            if(num % 2 != 0){
                continue;
            }
            if(!mapCount.containsKey(num)){
                mapCount.put(num,1);
            }else{
                mapCount.put(num, mapCount.get(num)+1);
            }
        }
        if(mapCount.isEmpty()){
            return -1;
        }
        int max = Collections.max(mapCount.values());
        List<Integer> result = mapCount.entrySet().stream()
        .filter(e -> e.getValue() == max)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        
        return Collections.min(result);
    }
}