// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         boolean[] check = new boolean[26];
//         for(int i=0 ; i<sentence.length() ; i++){
//             check[sentence.charAt(i) - 'a'] = true;
//         }
//         for(boolean i : check){
//             if(!i)
//                 return false;
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         int[] arr = new int[26];
        
//         // checks the frequency of the alphabets
//         for(var i: sentence.toCharArray()){
//             arr[i - 'a']++;
//         }
        
//         // checks if any of the arr index contains zero
//         for(var i: arr){
//             if(i == 0)
//                 return false;
//         }
        
//         return true;
//     }
// }

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] check = new int[26];
        for(var i : sentence.toCharArray()){
            check[i-'a']++;
        }
        for(var i : check){
            if(i==0)
                return false;
        }
        return true;
    }
}