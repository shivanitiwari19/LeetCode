class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0]=0;
        for(int j=1 ; j<alt.length ; j++){
            for(int i=0 ; i<j; i++){
                alt[j]+=gain[i];
            }
        }
        int max=alt[0];
        for(int i=0 ; i<alt.length ; i++){
            if(alt[i] > max)
                max=alt[i];
        }
        return max;
    }
}