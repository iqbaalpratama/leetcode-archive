class Solution {
    PriorityQueue<Integer> leftHeap;
    PriorityQueue<Integer> rightHeap;
    int largeIndex = 0;
    
    public int findKthLargest(int[] nums, int k) {
        leftHeap = new PriorityQueue<>((a,b) -> b-a);
        rightHeap = new PriorityQueue<>((a,b) -> a-b);
        largeIndex = k;
        for(int num : nums){
            addNum(num);
        }
        return rightHeap.peek();
    }
    
    public void addNum(int num){
        if(rightHeap.isEmpty()){
            rightHeap.add(num);
            return;
        }
        int topRight = rightHeap.peek();
        if(num >= topRight){
            rightHeap.add(num);
        }else{
            leftHeap.add(num);
        }
        if(rightHeap.size() > largeIndex){
            leftHeap.add(rightHeap.poll());
        }
        if(rightHeap.size() < largeIndex && leftHeap.size() > 0){
            rightHeap.add(leftHeap.poll());
        }
    }
}