class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        
        for(int i=0 ; i<indices.length ; i++){
            int a = indices[i][0];
            int b = indices[i][1];

            for(int j=0 ; j<n ; j++)
                res[a][j]++;
            
            for(int j=0 ; j<m ; j++)
                res[j][b]++;
        }
        int count=0;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(res[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
}