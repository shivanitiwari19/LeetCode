class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1 ; i<prefixSum.length ; i=i+1){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }
        long res = Integer.MIN_VALUE;
        for(int i =2; i<nums.length ; i++){
            if(nums[i] < prefixSum[i-1])
                res = prefixSum[i];
        }
        return (res == Integer.MIN_VALUE) ? -1 : res;
    }
}