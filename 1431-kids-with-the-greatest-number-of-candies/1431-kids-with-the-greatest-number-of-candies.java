class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            if(i > max){
                max = i;
            }
        }
        for(int i=0; i<candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}