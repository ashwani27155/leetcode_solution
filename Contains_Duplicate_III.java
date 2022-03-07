class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<i+1+k;j++){
                if(j>=nums.length){
                    break;
                }
                if(Math.abs((double)nums[i]-nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }
}
