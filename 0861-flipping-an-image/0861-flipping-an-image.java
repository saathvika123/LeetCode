class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        int row=0,col=0;
        int ans[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[0].length-1;j>=0;j--)
            {
                if(a[i][j]==0)
                ans[i][col]=1;
                else
                ans[i][col]=0;
                col++;
                if(col>=a[0].length) col=0;
            }
        }
        return ans;
    }
}