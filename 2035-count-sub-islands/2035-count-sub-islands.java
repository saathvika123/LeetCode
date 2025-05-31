class Solution {
    static int ans=0;
    public int countSubIslands(int[][] a1, int[][] a2) 
    {
        int r=a1.length,c=a1[0].length,cnt=0;
        ans=0;
        int vis[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a2[i][j]==1 && vis[i][j]==0)
                {
                    
                    if(isSubIsland(a1,a2,r,c,i,j,vis))
                        ans++;
                }
            }
        }
        return ans;
    }
    public boolean isSubIsland(int a1[][],int a2[][],int r,int c,int si,int sj,int vis[][])
    {
        
        if(si<0 || si>=r || sj<0 || sj>=c ||a2[si][sj]==0|| vis[si][sj]==1)
        return true;
        boolean f=(a1[si][sj]==1);
        vis[si][sj]=1;
       f &= isSubIsland(a1,a2,r,c,si-1,sj,vis);
        f&=isSubIsland(a1,a2,r,c,si,sj+1,vis);
        f&=isSubIsland(a1,a2,r,c,si+1,sj,vis);
        f&=isSubIsland(a1,a2,r,c,si,sj-1,vis);
        return f;
    }
}