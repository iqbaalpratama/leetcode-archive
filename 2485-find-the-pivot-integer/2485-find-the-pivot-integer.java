class Solution {
    public int pivotInteger(int n) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        int left = 0;
        int right = n-1;
        int sumLeft = arr[left];
        int sumRight = arr[right];
        while(left < right){            
            if(sumLeft < sumRight){
                left++;
                sumLeft += arr[left];
            }else if(sumLeft > sumRight){
                right--;
                sumRight += arr[right];
            }else{
                left++;
                right--;
                sumLeft += arr[left];
                sumRight += arr[right];
            }        
        }
        if(sumRight == sumLeft && left == right){
            return left+1;
        }else{
            return -1;
        }
    }
}