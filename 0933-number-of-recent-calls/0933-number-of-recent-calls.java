class RecentCounter {
    
    private List<Integer> counters;

    public RecentCounter() {
        counters = new ArrayList<>();
    }
    
    public int ping(int t) {
        counters.add(t);
        Long result = counters
          .stream()
          .filter(c -> c>=t-3000 && c<=t )
          .count();
        return result.intValue();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */