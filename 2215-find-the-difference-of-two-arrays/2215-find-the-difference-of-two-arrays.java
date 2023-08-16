class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> savedNum = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        for(int num : nums1){
            if(savedNum.isEmpty() || !savedNum.containsKey(num) ){
                savedNum.put(num, 1);
                continue;
            }
        }
        for(int num : nums2){
            if(savedNum.containsKey(num) && savedNum.get(num) != 2){
                savedNum.put(num,3);
                continue;
            }
            savedNum.put(num, 2);
        }
        savedNum.forEach((k,v) -> {
            if(v==1){
                answer1.add(k);
            }else if(v==2){
                answer2.add(k);
            }
        });
        answer.add(answer1);
        answer.add(answer2);
        return answer;
    }
}