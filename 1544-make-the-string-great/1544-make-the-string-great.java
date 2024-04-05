class Solution {
    public String makeGood(String s) {
        Stack<Character> stck = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stck.isEmpty() && Math.abs(c - stck.peek()) == 32) {
                stck.pop();
            } else {
                stck.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stck.isEmpty()) {
            result.insert(0, stck.pop());
        }
        
        return result.toString();
    }
}