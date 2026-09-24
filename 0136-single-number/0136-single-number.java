class Solution {
    public int singleNumber(int[] nums) {
        int lonely = 0;
        for(int x : nums){
            lonely ^= x;
        }
        return lonely;
    }
}