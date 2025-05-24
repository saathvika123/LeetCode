class Solution {
    static int di[]={-1,0,1,0};
    static int dj[]={0,1,0,-1};
    public int islandPerimeter(int[][] grid) 
    {
        int sr=0,sc=0,r=grid.length,c=grid[0].length,count=0;
        boolean vis[][]=new boolean[r][c];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    return bfs(grid,r,c,i,j,vis);
                }
            }
        }
        return count;
    }

    public int bfs(int a[][],int r,int c,int sr,int sc,boolean vis[][])
    {
        int ans=0;
        if(sr<0 || sr>=r || sc<0 || sc>=c || a[sr][sc]==0)
        {
            return 1;
        }
        if(vis[sr][sc]==true) return 0;
        vis[sr][sc]=true;
        for(int k=0;k<4;k++)
        {
            int ni=di[k]+sr;
            int nj=dj[k]+sc;
            ans+=bfs(a,r,c,ni,nj,vis);
        }
        return ans;
    }
}