class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        if(nums1.length == 0){
            return nums2;
        }
        if(nums2.length == 0){
            return nums1;
        }
        Map<Integer,Integer> treeMap = new TreeMap<>();
        for(int i=0; i<nums1.length; i++){
            treeMap.put(nums1[i][0], nums1[i][1]);
        }
        for(int i=0; i<nums2.length; i++){
            if(treeMap.containsKey(nums2[i][0])){
                treeMap.put(nums2[i][0], treeMap.get(nums2[i][0])+nums2[i][1]);
            }else{
                treeMap.put(nums2[i][0], nums2[i][1]);
            }
        }
        int[][] arrayRes = new int[treeMap.size()][2];
        int i = 0;
        for (int key : treeMap.keySet()) {
            arrayRes[i] = new int[]{key, treeMap.get(key)};
            i++;
        }
        return arrayRes;
    }
}