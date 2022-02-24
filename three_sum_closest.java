class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
           while(j<k){
               int curr_sum=nums[i]+nums[j]+nums[k];
               if(curr_sum<target){
                   j++;
               }
               else{
                   k--;
               }
               if(Math.abs(ans-target)>Math.abs(curr_sum-target)){
                   ans=curr_sum;
               }
           }
        }
        return ans;
    }
}
