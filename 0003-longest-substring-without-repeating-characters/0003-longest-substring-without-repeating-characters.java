class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int result = 0;
        for(int i=0; i<s.length(); i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(l));
                l+=1;
            }
            charSet.add(s.charAt(i));
            if(i-l+1 > result){
                result = i-l+1;
            }
        }
        return result;
    }
}