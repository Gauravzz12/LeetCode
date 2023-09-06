package Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
}
