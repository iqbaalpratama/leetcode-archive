class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        int remainder = 0;
        String res = "";
        while(lengthA>=0 || lengthB>=0){
            int A = lengthA >= 0 ? Character.getNumericValue(a.charAt(lengthA)) : 0;
            int B = lengthB >= 0 ? Character.getNumericValue(b.charAt(lengthB)) : 0;
            if(A == 1){
                if(B == 0){
                    if(remainder == 0){
                        res+="1";
                    }else{
                        res+="0";
                        remainder = 1;
                    }
                }else{
                    if(remainder == 0){
                        res+="0";
                        remainder = 1;
                    }else{
                        res+="1";
                        remainder = 1;
                    }
                }
            }else{
                if(B == 0){
                    if(remainder == 0){
                        res+="0"; 
                    }else{
                        res+="1";
                        remainder = 0;
                    }
                }else{
                    if(remainder == 0){
                        res+="1";
                    }else{
                        res+="0";
                        remainder = 1;
                    }
                }
            }
            lengthA--;
            lengthB--;
        }
        if(remainder == 1){
            res+="1";
        }
        StringBuilder sb = new StringBuilder(res);  
        sb.reverse();  
        return sb.toString();   
    }
}