class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> mappedPair = new HashMap<>();
        int n = grid.length;
        StringBuilder[] colWord = new StringBuilder[n];
        for(int i=0; i<n; i++){
            colWord[i] = new StringBuilder();
        }
        for(int i=0; i<n; i++){
            StringBuilder row = new StringBuilder();
            for(int j=0; j<n; j++){
                colWord[j].append(grid[i][j]);
                if(i!=n-1){
                    colWord[j].append(":");
                }
                row.append(grid[i][j]);
                if(j!=n-1){
                    row.append(":");
                }
            }
            if(mappedPair.containsKey(row.toString())){
               mappedPair.put(row.toString(), mappedPair.get(row.toString())+1); 
            }else{
                mappedPair.put(row.toString(), 1);
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            count += mappedPair.getOrDefault(colWord[i].toString(),0);
        }
        return count;
    }
}