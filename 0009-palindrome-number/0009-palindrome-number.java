class Solution {
    public boolean isPalindrome(int x) {
        String convertedInt = String.valueOf(x);
        StringBuilder sb = new StringBuilder(convertedInt);
        return convertedInt.equals(sb.reverse().toString());
        // for(int i=0; i<convertedInt.length()/2; i++){
        //     if(convertedInt.charAt(i) != convertedInt.charAt(convertedInt.length()-1-i)){
        //         return false;
        //     }
        // }
        // return true;
    }
}