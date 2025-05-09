class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int r=mat.length;
        int c=mat[0].length;
        int row=0,col=0;
        int ans[]=new int[r*c];
        for(int i=0;i<r*c;i++)
        {
            ans[i]=mat[row][col];
            if((row+col)%2==0)
            {
                if(col==c-1)
                row++;
                else if(row==0)
                col++;
                else
                {
                    col++;
                    row--;
                }
            }
            else
            {
                if(row==r-1)
                col++;
                else if(col==0)
                row++;
                else
                {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}