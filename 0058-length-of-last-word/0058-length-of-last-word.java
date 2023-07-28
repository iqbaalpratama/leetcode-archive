class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordsArray = s.split(" ");
        return wordsArray[wordsArray.length-1].length();
    }
}