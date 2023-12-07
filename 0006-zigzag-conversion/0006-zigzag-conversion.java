class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        char[] convertedString = s.toCharArray();
        int n = s.length();
        StringBuffer [] arr = new StringBuffer[numRows]; 
        for(int i=0; i<numRows; i++) {
            arr[i] = new StringBuffer();
        }
        int pivot = (numRows-1)*2;
        for(int i=0; i<convertedString.length; i++){
            int remainder = i % pivot;
            if(remainder < numRows){
                arr[remainder].append(convertedString[i]);
            }else{
                arr[remainder-((remainder-(numRows-1))*2)].append(convertedString[i]);               
            }
        }
        String res = "";
        for(int i=0; i<numRows; i++) {
            res+= arr[i].toString();
        }
        return res;
    }
}