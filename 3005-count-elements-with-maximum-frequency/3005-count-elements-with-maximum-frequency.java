class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int maxFreq = 0;
        for(int n : map.values()){
            maxFreq = Math.max(maxFreq, n);
        }
            
        int count = 0; 
        for(int n : map.values()) {
            if(n == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}


























// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         for (int num : nums) {
//             mp.put(num, mp.getOrDefault(num, 0) + 1);
//         }

//         int count = 0;
//         int maxFreq = Integer.MIN_VALUE;
//         for (int freq : mp.values()) {
//             maxFreq = Math.max(maxFreq, freq);
//         }

//         for (int freq : mp.values()) {
//             if (freq == maxFreq)
//                 count += maxFreq;
//         }
//         return count;
//     }
// }