class RecentCounter {
    
    private int up;
    private int down;
    private List<Integer> counters;

    public RecentCounter() {
        counters = new ArrayList<>();
    }
    
    public int ping(int t) {
        up = t-3000;
        down = t;
        counters.add(t);
        Long result = counters
          .stream()
          .filter(c -> c>=up && c<=down )
          .count();
        return result.intValue();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */