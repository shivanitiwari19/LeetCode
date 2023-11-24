class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        int row = 0;
        int col = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                ans[row][col] = matrix[i][j];

                row++;

                if(row % ans.length == 0) {
                    row = 0;
                    col++;
                }
            }
        }
        return ans;
    }
}