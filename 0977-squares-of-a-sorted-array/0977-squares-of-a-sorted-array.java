// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0 ; i<nums.length ; i++){
            
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int index = nums.length - 1;
        int[] res = new int[nums.length];
        while(l<=r){
            if (Math.abs(nums[l]) > Math.abs(nums[r])){
                res[index] = nums[l] * nums[l];
                l++;
            }
            else{
                res[index] = nums[r] * nums[r];
                r--;
            }
            index--;
        }
        return res;
    }
}


