package Arrays_Strings_Hashing;
class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int greatest=arr[n-1];
        for(int i=n-1;i>=0;i--){
            int x=arr[i];
            arr[i]=greatest;
            greatest=Math.max(greatest,x);
        }
        arr[n-1]=-1;
        return arr;
    }
}