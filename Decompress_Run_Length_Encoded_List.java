class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i=i+2){
           count=count+nums[i];
        }
        int t=0;
        int a[]=new int[count];
        for(int i=0;i<nums.length;i=i+2){
            for(int j=0;j<nums[i];j++){
                a[t++]=nums[i+1];
            }
        }
        return a;
    }
}
