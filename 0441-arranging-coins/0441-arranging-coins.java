class Solution {
    public int arrangeCoins(int n) {
        int r = 0;
        for(r=1 ; r<=n ; r++)             
            n = n - r;
        return r-1;
    }
}