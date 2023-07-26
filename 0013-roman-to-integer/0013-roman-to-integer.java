class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> groupChar = new HashMap<>();
        groupChar.put('I', 1);
        groupChar.put('V', 5);
        groupChar.put('X', 10);
        groupChar.put('L', 50);
        groupChar.put('C', 100);
        groupChar.put('D', 500);
        groupChar.put('M', 1000);
        int res = 0;
        for(int i=0; i<s.length()-1; i++){
            if(groupChar.get(s.charAt(i)) >= groupChar.get(s.charAt(i+1))){
                res += groupChar.get(s.charAt(i));
            }else{
                res -= groupChar.get(s.charAt(i));
            }
        }
        res += groupChar.get(s.charAt(s.length()-1));
        return res;
    }
}