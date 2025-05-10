class Solution {
    public void setZeroes(int[][] a) 
    {
        int r=a.length;
        int c=a[0].length;
        int a1[]=new int[r];
        int a2[]=new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==0) 
                {
                    a1[i]=1;
                    a2[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               if(a1[i]==1 ||a2[j]==1) a[i][j]=0;
            }
        }
    }
}