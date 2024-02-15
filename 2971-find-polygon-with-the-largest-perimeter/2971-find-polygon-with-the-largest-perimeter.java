class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] prefixsum = new long[nums.length];
        prefixsum[0] = nums[0];
        for(int i=1 ; i<prefixsum.length ; i++){
            prefixsum[i] = nums[i] + prefixsum[i-1];
        }
        long result = Integer.MIN_VALUE;
        for(int i =2; i<nums.length ; i++){
            if(nums[i] < prefixsum[i-1])
                result = prefixsum[i];
        }
        return (result == Integer.MIN_VALUE) ? -1 : result;
    }
}