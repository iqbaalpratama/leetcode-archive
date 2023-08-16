class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String temp;
        String[] arrOfStr = s.split("\\s+");
        for(int i=0; i<arrOfStr.length/2; i++){
            temp = arrOfStr[i];
            arrOfStr[i] = arrOfStr[arrOfStr.length-1-i];
            arrOfStr[arrOfStr.length-1-i]=temp;
        }
        return String.join(" ", arrOfStr);
    }
}