class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int flag=0;
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                if(numbers[i] + numbers[j] == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    flag = 1;
                }
            }
            if(flag==1)
                break;
        }
        return res;
    }
}