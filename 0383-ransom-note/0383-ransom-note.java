class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mapRansomNote = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            if(mapRansomNote.size() == 0){
                mapRansomNote.put(magazine.charAt(i), 1);
                continue;
            }
            if(!mapRansomNote.containsKey(magazine.charAt(i))){
                mapRansomNote.put(magazine.charAt(i), 1);
            }else{               
                mapRansomNote.put(magazine.charAt(i), mapRansomNote.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(!mapRansomNote.containsKey(ransomNote.charAt(i))){
                return false;
            }
            if(mapRansomNote.get(ransomNote.charAt(i)) < 1){
                return false;
            }else{
                mapRansomNote.put(ransomNote.charAt(i), mapRansomNote.get(ransomNote.charAt(i))-1);
            }
        }
        return true;
    }
}