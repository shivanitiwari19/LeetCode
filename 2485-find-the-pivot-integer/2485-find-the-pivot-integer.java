class Solution {
    public int pivotInteger(int n) {
        
        if(Math.sqrt(n*(n+1)/2) - Math.ceil(Math.sqrt(n*(n+1)/2)) == 0)
            return (int) Math.sqrt(n*(n+1)/2);
        else 
            return -1;
    }
}