class Solution {
    public int[] shuffle(int[] nums, int n) {
       int b[]=new int[2*n];
        for(int i=0,j=0;i<n;i++,j=j+2){
            b[j]=nums[i];
            b[j+1]=nums[i+n];
        }
       
        return b;
    }
}
