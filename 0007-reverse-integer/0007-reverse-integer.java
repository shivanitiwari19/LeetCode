class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        long rev = 0;
        while(num>0){
            int r =  num % 10;
            rev = rev*10 + r;
            num/=10;
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;
        return (x>0) ? ((int)rev) : ((int)-rev) ;
    }
}