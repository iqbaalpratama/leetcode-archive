class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> notes = new HashMap<>();
        for(int i=0; i<s.length() && i<t.length(); i++){
            if(notes.isEmpty()){
                notes.put(s.charAt(i), t.charAt(i));
                continue;
            }
            if(notes.containsKey(s.charAt(i)) && !notes.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
            if(notes.containsValue(t.charAt(i)) && !notes.containsKey(s.charAt(i))){
                return false;
            }
            notes.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}