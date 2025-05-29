class Solution
{
    public int numIslands(char[][] a) 
    {
        int r=a.length,c=a[0].length;
        int vis[][]=new int[r][c];
        int cnt=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]=='1' && vis[i][j]==0)
                {
                    dfs(a,vis,r,c,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(char a[][],int vis[][],int r,int c,int i,int j)
    {
        if(i<0 || i>=r || j<0 || j>=c || a[i][j]!='1') 
        return;
        vis[i][j]=1;
        a[i][j]=8;
        dfs(a,vis,r,c,i-1,j);
        dfs(a,vis,r,c,i,j+1);
        dfs(a,vis,r,c,i+1,j);
        dfs(a,vis,r,c,i,j-1);
        
    }
}