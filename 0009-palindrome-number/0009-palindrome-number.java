class Solution {
    public boolean isPalindrome(int x) {
        String convertedInt = String.valueOf(x);
        for(int i=0; i<convertedInt.length()/2; i++){
            if(convertedInt.charAt(i) != convertedInt.charAt(convertedInt.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}