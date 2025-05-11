class Solution {
    public int[] findMissingAndRepeatedValues(int[][] a) 
    {
        int r=a.length;
        int c=a[0].length;
        int a1[]=new int[r*c+1];
        int b[]=new int[2];
        int idx=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a1[a[i][j]]++;
            }
        }
        for(int i=1;i<=r*c;i++)
        {
            if(a1[i]==2) b[0]=i;
            if(a1[i]==0) b[1]=i;
        }
        return b;
    }
}