class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapArr = new HashMap<>();
        for(int i : arr){
            if(mapArr.isEmpty()){
                mapArr.put(i, 1);
                continue;
            }
            if(mapArr.containsKey(i)){
                mapArr.put(i, mapArr.get(i)+1);
            }else{
                mapArr.put(i, 1);
            }
        }
        return mapArr.values().stream().distinct().count() == mapArr.values().size() ? true : false;
    }
}