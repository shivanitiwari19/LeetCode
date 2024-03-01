class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = -1; 
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            count += (s.charAt(i) == '1') ? 1 : 0;
        }
        for(int i = 0 ; i<s.length() ; i++, count--){
            ans.append(count > 0 ? '1' : '0');
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.append('1').toString();
    }
}
