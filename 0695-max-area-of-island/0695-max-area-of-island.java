class Solution {
    static int di[]={-1,0,1,0};
    static int dj[]={0,1,0,-1};
    public int maxAreaOfIsland(int[][] grid) 
    {
        int r=grid.length,c=grid[0].length;
        int mx=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    int val=bfs(grid,i,j,r,c,8);
                    mx=Math.max(mx,val);
                }
            }
        }
        return mx;
    }
    public int bfs(int grid[][],int sr,int sc,int r,int c,int nw)
    {
        int cnt=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sr,sc));
        grid[sr][sc]=nw;
        int i,j;
        while(!q.isEmpty())
        {
            Pair s=q.remove();
            i=s.i;
            j=s.j;
            for(int k=0;k<4;k++)
            {
                int ni=i+di[k];
                int nj=j+dj[k];
                if(ni>=0 && ni<r && nj>=0 && nj<c && grid[ni][nj]==1)
                {
                    q.add(new Pair(ni,nj));
                    grid[ni][nj]=nw;
                    cnt++;
                }

            }
        }
        return cnt;

    }
}
class Pair
{
    int i,j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}