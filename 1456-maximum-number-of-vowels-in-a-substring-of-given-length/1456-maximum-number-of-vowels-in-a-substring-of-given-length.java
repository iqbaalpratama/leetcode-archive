class Solution {
    public int maxVowels(String s, int k) {
        Character[] vowelsArray = {'a','i','u','e','o'};
        List<Character> vowels = Arrays.asList(vowelsArray);
        int count = 0;
        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }    
        }
        int largestCount = count;
        for(int i=1; i<=s.length()-k; i++){
            if(vowels.contains(s.charAt(i-1)) && count > 0){
                count--;
            }
            if(vowels.contains(s.charAt(i+k-1))){
                count++;
            }
            largestCount = Math.max(largestCount, count);
        }
        return largestCount;
    }
}