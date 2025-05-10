class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        int row=0,col=0,r=a.length,c=a[0].length;
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(a[i][j]==0)
                ans[i][col++]=1;
                else
                ans[i][col++]=0;
                if(j==0) col=0;
            }
        }
        return ans;
    }
}