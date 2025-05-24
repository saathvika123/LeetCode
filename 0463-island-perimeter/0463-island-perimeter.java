class Solution {
    static int di[]={-1,0,1,0};
    static int dj[]={0,1,0,-1};
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             if(grid[i][j]==1)
             {
               ans+=fill(grid,i,j,r,c,1,8);
             }
            }  
        }
        return ans; 
    }
    public static int fill(int grid[][],int i,int j,int r,int c,int old,int neww)
    {
        int ans=0;
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]==0)
        return 1;
         if(grid[i][j]==neww)
        return 0;
        grid[i][j]=neww;
        for(int k=0;k<4;k++)
        {
            ans+=fill(grid,i+di[k],j+dj[k],r,c,old,neww);
        }
        return ans;
    }
}