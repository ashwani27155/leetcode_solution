class Solution {
    public int countElements(int[] nums) {
     Arrays.sort(nums);
     int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[nums.length-1]&&nums[i]>nums[0]){
                count++;
            }
        }
        return count;
    }
}
