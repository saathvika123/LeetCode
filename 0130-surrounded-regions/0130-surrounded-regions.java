class Solution {
    public void solve(char[][] a) 
    {
        int r=a.length,c=a[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if((i==0 || i==r-1 || j==0 || j==c-1) && a[i][j]=='O')
                {
                    dfs(a,r,c,i,j);
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]=='O')
                {
                    a[i][j]='X';
                }
            }
        }
           for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]=='p')
                {
                    a[i][j]='O';
                }
            }
        }
    }
    public void dfs(char a[][],int r,int c,int si,int sj)
    {
        if(si<0 || si>=r || sj<0 || sj>=c || a[si][sj]!='O')
        return;
        a[si][sj]='p';
        dfs(a,r,c,si-1,sj);
        dfs(a,r,c,si,sj+1);
        dfs(a,r,c,si+1,sj);
        dfs(a,r,c,si,sj-1);
    }
}