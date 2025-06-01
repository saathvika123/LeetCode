class Solution 
{
    public int[][] colorBorder(int[][] grid, int row, int col, int color) 
    {
        int r=grid.length,c=grid[0].length;
        int vis[][]=new int[r][c];
       int org=grid[row][col];
        dfs(grid,row,col,r,c,org,vis,color);
        return grid;
    }
    public void dfs(int grid[][],int si,int sj,int r,int c,int org,int vis[][],int color)
    {
        if(si<0 || si>=r || sj<0 || sj>=c || vis[si][sj]==1 || grid[si][sj]!=org)
        return;
        vis[si][sj]=1;
        boolean isBorder=false;
        if(si==0 || sj==0 || si==r-1 || sj==c-1 || 
        grid[si-1][sj]!=org || grid[si+1][sj]!=org ||grid[si][sj-1]!=org ||grid[si][sj+1]!=org)
        isBorder=true;
        dfs(grid,si+1,sj,r,c,org,vis,color);
        dfs(grid,si-1,sj,r,c,org,vis,color);
        dfs(grid,si,sj+1,r,c,org,vis,color);
        dfs(grid,si,sj-1,r,c,org,vis,color);
        if(isBorder) 
        grid[si][sj]=color;
    }
}