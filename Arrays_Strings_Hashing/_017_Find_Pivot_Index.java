class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int n:nums){
            rightSum+=n;
        }
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            if(rightSum-leftSum+nums[i]==0){
                return i;
            }   
        }
        return -1;
    }
}