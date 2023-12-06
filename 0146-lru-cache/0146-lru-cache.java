class LRUCache {
    
    LinkedHashMap<Integer, Integer> result;
    
    
    public LRUCache(int capacity) {
        result = new LinkedHashMap<Integer, Integer>(capacity) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
            {
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        int res = result.getOrDefault(key, -1);
        if(res != -1){
            result.remove(key);
            result.put(key,res);
        }
        return res;
    }
    
    public void put(int key, int value) {
        if(result.containsKey(key)){
            result.remove(key);
        }
        result.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */