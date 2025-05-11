class Solution {
    public int[] rowAndMaximumOnes(int[][] a) 
    {
        int r=a.length,c=a[0].length;
            int mn=Integer.MIN_VALUE;
            int idx=0;
        for(int i=0;i<r;i++)
        {
            int count=0;
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1) count++;
            }
            //mn=Math.max(mn,count);
            if(mn<count)
            {
                mn=count;
                idx=i;
            }
        }
        return new int[]{idx,mn};
    }
}