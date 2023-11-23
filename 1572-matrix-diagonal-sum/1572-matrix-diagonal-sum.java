// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum=0;
//         for(int i=0; i<mat.length ; i++){
//             for(int j=0 ; j<mat.length ; j++){
//                 if(i==j || (i+j)==mat.length-1){
//                     sum+=mat[i][j];
//                     mat[i][j]=0;
//                 }
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            // Add elements from primary diagonal.
            ans += mat[i][i];
            // Add elements from secondary diagonal.
            ans += mat[n - 1 - i][i];
        }
        // If n is odd, subtract the middle element as its added twice.
        if (n % 2 != 0) {
            ans -= mat[n / 2][n / 2];
        }

        return ans;
    }
}