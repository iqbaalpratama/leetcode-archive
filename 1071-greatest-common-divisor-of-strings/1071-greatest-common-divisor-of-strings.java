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
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)  
        {     
            if(num1%i==0 && num2%i==0){
                gcd = i;     
            }  
        }
        return gcd;
    }
}