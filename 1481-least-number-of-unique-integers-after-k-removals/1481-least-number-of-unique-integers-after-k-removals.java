class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[] countFreq = new int[arr.length + 1];
        for(int count : map.values()){
            countFreq[count]++;
        }
        int remUniqueElements = map.size();
        for(int i=1 ; i<=arr.length ; i++){
            int numToRemove = Math.min(k/i, countFreq[i]);
            k-=(i*numToRemove);
            remUniqueElements -= numToRemove;
            if(k<i){
                return remUniqueElements;
            }
        }
        return 0;
    }
}