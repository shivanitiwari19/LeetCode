class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];
        for(int i=0 ; i<sentence.length() ; i++){
            check[sentence.charAt(i) - 'a'] = true;
        }
        for(boolean i : check){
            if(!i)
                return false;
        }
        return true;
    }
    
}

// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         boolean[] check = new boolean[26];
//         for(int i=0 ; i<sentence.length() ; i++){
//             check[i-'a'] = true;
//         }
//         for(boolean i : check){
//             if(!i)
//                 return false;
//         }
//         return true;
//     }
// }