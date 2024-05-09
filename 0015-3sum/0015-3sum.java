// class Solution {
//     public List<List<Integer>> threeSum(int[] arr) {
//         if(arr == null || arr.length < 3)
//             return new ArrayList<>();
        
//         Arrays.sort(arr);
//         Set<List<Integer>> result = new HashSet<>();
        
//         for(int i = 0 ; i < arr.length - 2 ; i++){
//             int left = i + 1;
//             int right = arr.length - 1;
            
//             while(left < right){
//                 int sum = arr[i] + arr[left] + arr[right];
                
//                 if(sum == 0){
//                     result.add(Arrays.asList(arr[i], arr[left], arr[right]));
//                     left++;
//                     right--;
//                 }
//                 else if(sum<0)
//                     left++;
//                 else 
//                     right--;
//             }
//         }
//         return new ArrayList<>(result);
//     }
// }


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        
        if (nums.length < 3) {
            return answer;
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                break;
            }
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > 0) {
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    int lastLowOccurrence = nums[low];
                    int lastHighOccurrence = nums[high];
                    
                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }
                    
                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        return answer;
    }
}