public class Solution {
    public int hammingWeight(int n) {       
		int count = 0;        
		while (n != 0) {
            n &= (n - 1); // to clear the right most set bit
            ++count;
        }		
        return count;
    }
}