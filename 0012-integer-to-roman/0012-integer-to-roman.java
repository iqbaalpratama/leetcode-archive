class Solution {
    public String intToRoman(int num) {
        String[] oneDigit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] twoDigit = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] threeDigit = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] fourDigit = {"", "M", "MM", "MMM"};
        return fourDigit[(num/1000)%10] + threeDigit[(num/100)%10] + twoDigit[(num/10)%10] + oneDigit[num%10];
    }
}