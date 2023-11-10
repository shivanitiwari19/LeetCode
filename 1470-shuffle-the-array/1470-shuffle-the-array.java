class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = nums.length/2;
        int s=0, m=j;
        int i=0;
        while(s<j && m<nums.length){
            ans[i]=nums[s++];
            ans[i+1]=nums[m++];
            i=i+2;
        }
        return ans;
    }
}