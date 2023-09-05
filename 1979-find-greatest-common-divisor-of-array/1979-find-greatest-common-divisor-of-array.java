class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1001;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return gcd(min,max);
    }
    
    static int gcd(int a, int b)
    {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}