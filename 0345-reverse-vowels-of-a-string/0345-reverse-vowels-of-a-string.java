class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while(left<right){
            if((charArray[left]== 'a' || charArray[left] == 'A' ||
                charArray[left]== 'i' || charArray[left] == 'I' ||
                charArray[left]== 'u' || charArray[left] == 'U' ||
                charArray[left]== 'e' || charArray[left] == 'E' ||
                charArray[left]== 'o' || charArray[left] == 'O'
              ) && (
                charArray[right]== 'a' || charArray[right] == 'A' ||
                charArray[right]== 'i' || charArray[right] == 'I' ||
                charArray[right]== 'u' || charArray[right] == 'U' ||
                charArray[right]== 'e' || charArray[right] == 'E' ||
                charArray[right]== 'o' || charArray[right] == 'O'
            )){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }else if(charArray[left]== 'a' || charArray[left] == 'A' ||
                charArray[left]== 'i' || charArray[left] == 'I' ||
                charArray[left]== 'u' || charArray[left] == 'U' ||
                charArray[left]== 'e' || charArray[left] == 'E' ||
                charArray[left]== 'o' || charArray[left] == 'O'){
                right--;
            }else if(charArray[right]== 'a' || charArray[right] == 'A' ||
                charArray[right]== 'i' || charArray[right] == 'I' ||
                charArray[right]== 'u' || charArray[right] == 'U' ||
                charArray[right]== 'e' || charArray[right] == 'E' ||
                charArray[right]== 'o' || charArray[right] == 'O'){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}