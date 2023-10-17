class Solution {
    public int subtractProductAndSum(int n) {
        int count = 0;
        int product = 1;
        while (n > 0) {
            count += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - count;
    }
}