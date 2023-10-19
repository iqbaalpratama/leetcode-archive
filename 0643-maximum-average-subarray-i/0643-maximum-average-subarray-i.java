class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum+= nums[i];    
        }
        int largestSum = sum;
        for(int i=1; i<=nums.length-k; i++){
            sum -= nums[i-1];
            sum += nums[i+k-1];
            largestSum = Math.max(largestSum, sum);
        }
        return Double.valueOf(largestSum)/Double.valueOf(k);
    }
}