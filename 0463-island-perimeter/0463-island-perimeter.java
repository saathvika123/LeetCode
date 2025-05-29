class Solution {
    static int count=0;
    public int islandPerimeter(int[][] a) 
    {
        int r=a.length,c=a[0].length;
        int sr=-1,sc=-1;
        int vis[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                {
                   return bfs(a,i,j,r,c,vis);
                }
            }
        }
       return 0;
        
    }
    public static int bfs(int a[][],int sr,int sc,int r,int c,int vis[][])
    {   if(sr < 0 || sr>=r || sc<0 || sc>=c || a[sr][sc]==0)
          return 1;
          if(vis[sr][sc]==1) return 0;
          vis[sr][sc]=1;
        count = bfs(a,sr - 1, sc,r,c,vis) +
         bfs(a, sr, sc + 1,r,c,vis) + 
         bfs(a, sr + 1, sc,r,c,vis) +
          bfs(a, sr, sc - 1,r,c,vis);
        return count;
    }
}