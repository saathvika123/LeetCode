class Solution {
    public void rotate(int[][] a) {
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<c;i++)
        {
                int s=0,e=r-1;
                while(s<e)
                {
                    int temp=a[s][i];
                    a[s][i]=a[e][i];
                    a[e][i]=temp;
                    s++;
                    e--;
                }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i!=j && i<j)
                {
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
}