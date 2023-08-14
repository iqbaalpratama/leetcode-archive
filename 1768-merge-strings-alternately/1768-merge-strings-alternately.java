class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String result = "";
        while(i < word1.length() || i < word2.length()){
            if(i>=word1.length()){
                result += "";
            }else{
                result += word1.charAt(i);
            }
            if(i>=word2.length()){
                result += "";
            }else{
                result += word2.charAt(i);
            }
            i++;
        }
        return result;
    }
}