class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        for(int num : nums) res = Math.max(res, num);
        int currmax=1;
        int currmin=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currmax=1;
                currmin=1;
                continue;
            }else{
                int temp = currmax * nums[i];
                currmax=Math.max(Math.max(currmax*nums[i],currmin*nums[i]),nums[i]);
                currmin=Math.min(Math.min(currmin*nums[i],temp),nums[i]);
            }
            res=Math.max(currmax,res);
        }
        return res;
    }
}