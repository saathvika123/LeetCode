class Solution {
    public int eraseOverlapIntervals(int[][] inter) 
    {
       Arrays.sort(inter,(a,b)->Integer.compare(a[1],b[1]));
       int ans=0,x=inter[0][1];
       for(int i=1;i<inter.length;i++)
       {
            if(inter[i][0]<x)
            {
                ans++;
            }
            else
            {
                x=inter[i][1];
            }
       }
       return ans;
    }
}