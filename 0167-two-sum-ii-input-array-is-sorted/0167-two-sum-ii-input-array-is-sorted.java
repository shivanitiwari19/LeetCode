class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left<right){
            if(numbers[left] + numbers[right] < target)
                left++;
            else if(numbers[left] + numbers[right] > target)
                right--;
            else
                return new int[]{left+1, right+1};
        }
        return new int[0];
    }
}





// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] res = new int[2];
//         int flag=0;
//         for(int i=0 ; i<numbers.length ; i++){
//             for(int j=i+1 ; j<numbers.length ; j++){
//                 if(numbers[i] + numbers[j] == target){
//                     res[0] = i+1;
//                     res[1] = j+1;
//                     flag = 1;
//                 }
//             }
//             if(flag==1)
//                 break;
//         }
//         return res;
//     }
// }