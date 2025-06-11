class Solution {
    static int di[]={-1,0,1,0};
    static int dj[]={0,1,0,-1};
    public int findMaxFish(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean visited[][]=new boolean[r][c];
        int max=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]>0)
                {
                    int x=fill(grid,i,j,r,c,visited);
                    max=Math.max(x,max);
                }
            }
        }
        return max; 
    }
    public static int fill(int grid[][],int i,int j,int r,int c,boolean visited[][])
    {
        if(i<0 || j<0 || i>=r || j>=c || visited[i][j] || grid[i][j]==0)
        return 0;
        visited[i][j]=true;
         int x=grid[i][j];
        for(int k=0;k<4;k++)
        {
         x+=fill(grid,i+di[k],j+dj[k],r,c,visited);
        }
        return x;
    }
}