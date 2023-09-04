class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        if(numRows == 1){
            return result;
        }
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        result.add(row1);
        if(numRows == 2){
            return result;
        }
        for(int i=3; i<=numRows; i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            int left = 0;
            int right = 1;
            for(int j=2; j<i; j++){
                // System.out.println(result.get(i-2));
                newRow.add(result.get(i-2).get(left)+result.get(i-2).get(right));
                left++;
                right++;
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}