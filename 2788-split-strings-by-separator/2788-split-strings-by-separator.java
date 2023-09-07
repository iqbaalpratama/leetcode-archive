class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(String word : words){
            for(String splitWord : word.split("\\Q"+String.valueOf(separator)+"\\E")){
                if(splitWord != ""){
                    result.add(splitWord);
                }
            }
        }
        return result;
    }
}