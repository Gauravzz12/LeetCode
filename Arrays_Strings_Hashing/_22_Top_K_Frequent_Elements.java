class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,0);
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int max=0;
            int n=0;
            for(int x:map.keySet()){
                if(map.get(x)>=max){
                    max=map.get(x);
                    n=x;
                }
            }
            ans[i]=n;
            map.remove(n);
        }
        return ans;

    }
}