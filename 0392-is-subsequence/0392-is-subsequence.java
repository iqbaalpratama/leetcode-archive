class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int i=0;
        int j=0;
        boolean result = false;
        while(j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i >= s.length()){
                break;
            }
            j++;
        }
        return i == s.length();
    }
}