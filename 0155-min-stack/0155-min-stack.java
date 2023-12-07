class MinStack {
    
    private List<Element> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.size() == 0){
            Element element = new Element(val, val);
            stack.add(element);
            return;
        }
        
        Element element = stack.get(0);
        int min = element.getCurrMin();
        if(val < min){
            Element newElement = new Element(val, val);
            stack.add(0, newElement);
        }else{
            Element newElement = new Element(val, min);
            stack.add(0, newElement);
        }
    }
    
    public void pop() {
        stack.remove(0);
    }
    
    public int top() {
        return stack.get(0).getValue();
    }
    
    public int getMin() {
        if (stack.size() == 0) {
            return -1;
        }            
        return stack.get(0).getCurrMin();
    }
}

class Element{
    private int value;
    private int currMin;
    
    public Element(int value, int currMin){
        this.value = value;
        this.currMin = currMin;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public int getCurrMin(){
        return this.currMin;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */