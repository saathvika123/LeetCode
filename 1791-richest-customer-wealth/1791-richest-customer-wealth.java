class Solution {
    public int maximumWealth(int[][] a) 
    {
        long mn=Long.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            long sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
            mn=Math.max(sum,mn);
        }
        return (int)mn;
    }
}