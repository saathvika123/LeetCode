class Solution 
{
    public int minimumOperations(int[][] a) 
    {
        int c=a[0].length;
        int r=a.length;
        int s=0;
        for(int i=0;i<c;i++)
        {
            int co=0;
            for(int j=1;j<r;j++)
            {
                while(a[j][i]<=a[j-1][i])
                {
                    a[j][i]+=1;
                    co++;
                }
            }
            s+=co;
        }
        return s;
    }
}