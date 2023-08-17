class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.empty() && c != '*'){
                stack.push(c);
                continue;
            }
            if(c == '*'){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ", "");
    }
}