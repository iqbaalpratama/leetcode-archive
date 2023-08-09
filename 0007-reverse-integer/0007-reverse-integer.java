class Solution {
    public int reverse(int x) {
        int result = 0;
        int currentDigit;
        int signMultiplier = 1;
        if(x < 0){
            signMultiplier = -1;
            x *= signMultiplier;
        }
        while(x > 0){
            if(result * signMultiplier > Integer.MAX_VALUE / 10 || result * signMultiplier < Integer.MIN_VALUE / 10){
                return 0;
            }
            currentDigit = x % 10;
            result = result * 10 + currentDigit;
            x /= 10;
        }
        return result * signMultiplier;
    }
}