class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
                i++;
        }
        
        // just find missing numbers 
        List<Integer> ans = new ArrayList<>();
        for(int ind = 0 ; ind < nums.length ; ind++){
            if(nums[ind] != ind+1)
                ans.add(ind+1);
        }
        return ans;
    }
}