class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int n1 = nums[0];
        for(int i =1;i<n;i++){
            nums[i] +=n1;
            n1 = nums[i];
            
        }return nums;
    }
}