class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> notes = new HashMap<>();
        int max = 0;
        for(int i : nums){
            if(notes.isEmpty()){
                notes.put(i, 1);
                max = i;
                continue;
            }
            if(!notes.containsKey(i)){
                notes.put(i, 1);
            }else {
                if(notes.get(i)+1 > notes.get(max)){
                    max = i;
                }
                notes.put(i, notes.get(i)+1);
            }
        }
        return max;
    }
}