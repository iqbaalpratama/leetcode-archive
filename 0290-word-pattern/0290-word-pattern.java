class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> notes = new HashMap<>();
        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length){
            return false;
        }
        for(int i=0; i<pattern.length() && i<sArray.length; i++){
            if(!notes.containsKey(pattern.charAt(i))){
                if(notes.containsValue(sArray[i])){
                    return false;
                }
                notes.put(pattern.charAt(i), sArray[i]);
            }else{
                if(!notes.get(pattern.charAt(i)).equals(sArray[i])){
                    return false;
                }
            }
        }
        return true;
    }
}