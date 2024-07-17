class Solution {
    public int[][] rowIncrement(int[][] indices, int row){

        for(int i=0; i<indices[row].length; i++){
            indices[row][i]++;
        }
        return indices;
    }

    public int[][] columnIncrement(int[][] indices, int column){

        for(int i=0; i<indices.length; i++){
            indices[i][column]++;
        }
        return indices;
    }

    public int oddCells(int m, int n, int[][] indices) {
        int[][] inp = new int[m][n];
        
        for(int i=0; i<indices.length; i++){
            rowIncrement(inp,indices[i][0]);
            columnIncrement(inp,indices[i][1]);
        }

        int out = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(inp[i][j]%2 != 0){
                    out++;
                }
            }
        }
        return out;
    }
}
