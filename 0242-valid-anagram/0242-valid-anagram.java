class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(wordMap.isEmpty() || !wordMap.containsKey(c)){
                wordMap.put(c, 1);
            } else{
                wordMap.put(c, wordMap.get(c)+1);
            }
        }
        for(Character c : t.toCharArray()){
            if(!wordMap.containsKey(c) || wordMap.get(c) < 1){
                return false;
            } else{
                if(wordMap.get(c) == 1){
                    wordMap.remove(c);
                }else{
                    wordMap.put(c, wordMap.get(c)-1);
                }
            }
        }
        return wordMap.isEmpty();
    }
}