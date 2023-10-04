class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        
        int k=0;
        for(int i=0;i<nums1.length;i++){
            int max=-1;
            for(int j=nums2.length-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    ans[k++]=max;
                }
                else{
                    if(nums2[j]>nums1[i]){
                        max=nums2[j];
                    }
                }
            }
        }
        return ans;
       

    }
} 