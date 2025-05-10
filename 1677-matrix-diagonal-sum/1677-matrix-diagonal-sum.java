class Solution {
    public int diagonalSum(int[][] mat)
     {
        int r=mat.length;
        int c=mat[0].length;
        int s=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j || Math.abs(i+j)==r-1) s+=mat[i][j];

            }
        }
       // if(r%2!=0) return s-=mat[r/2][c/2];
        return s;
    }
}