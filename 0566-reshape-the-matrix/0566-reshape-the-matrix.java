class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a[][]=new int[r][c];
        int row=0,col=0;
        int rlen=mat.length;
        int clen=mat[0].length;
        if(r*c!=rlen*clen) return mat;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=mat[row][col];
                if(col==clen-1)
                {
                    row++;
                    col=0;
                }
                else
                { col++;
                }
                
            }
        }
        return a;
    }
}