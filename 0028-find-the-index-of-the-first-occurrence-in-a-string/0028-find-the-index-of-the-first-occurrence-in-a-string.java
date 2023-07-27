class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()){
            return -1;
        }
        if (needle.length() == haystack.length()){
            if(haystack.equals(needle)){
                return 0;
            }   return -1;
        }
        boolean flag = false;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) != needle.charAt(0)){
                continue;
            }
            String compare = String.valueOf(haystack.charAt(i));
            if(needle.equals(compare)){
                return i;
            }
            for(int j=i+1; j<haystack.length(); j++){
                compare += haystack.charAt(j);
                if(needle.equals(compare)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}