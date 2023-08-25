class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> listNum = new ArrayList<>();
        for(int num : nums1){
            listNum.add(num);
        }
        for(int num : nums2){
            listNum.add(num);
        }
        Collections.sort(listNum);
        if(listNum.size()%2 == 1){
            return Double.valueOf(listNum.get(listNum.size()/2));
        }else {
            return (Double.valueOf(listNum.get(listNum.size()/2))+Double.valueOf(listNum.get(listNum.size()/2-1))) / Double.valueOf(2);
        }
    }
}