class Solution {
    public int smallestEvenMultiple(int n) {
        int helper = n;
        while(helper <= n * 2){
            if(helper % 2 == 0 && helper % n == 0){
                return helper;
            }
            helper++;
        }
        return helper;
    }
}