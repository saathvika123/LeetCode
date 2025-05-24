class Solution 
{                                                                                                         
    static int di[]={-1,0,1,0};
    static int dj[]={0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int col) 
    {
        int r=image.length,c=image[0].length;
        int or=image[sr][sc];
        if(or!=col)
        bfs(image,sr,sc,col,or,r,c);
        return image;
    }
    public void bfs(int a[][],int sr,int sc,int col,int or,int r,int c)
    {
        if(sr<0 || sr>=r || sc<0 || sc>=c || a[sr][sc]!=or)
        return;
        a[sr][sc]=col;
        for(int k=0;k<4;k++)
        {
            int ni=di[k]+sr;
            int nj=dj[k]+sc;
            bfs(a,ni,nj,col,or,r,c);
        }
    }
}