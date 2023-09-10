package Arrays_Strings_Hashing;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int count=0;
        for(int num:nums){
            if(num!=val){
                count++;
                nums[k++]=num;
            }
        }
        return count;
    }
}