class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        String result = "";
        for(int i=1; i <= gcd(str1.length(), str2.length()); i++){
            result += str1.charAt(i-1);
        }
        return result;
    }
    
    private int gcd(int num1, int num2){
       if (num2 == 0) {
        return num1;
        }
        return gcd(num2, num1 % num2);
    }
}