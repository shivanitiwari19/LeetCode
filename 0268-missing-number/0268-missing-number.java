class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while (i < arr.length){
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        
        for(int index=0 ; index < arr.length ; index++){
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

 