class Solution {
    public int minSubArrayLen(int tar, int[] a) {
        int l=0,ans=Integer.MAX_VALUE,val=0;
        for(int r=0;r<a.length;r++)
        {
            val+=a[r];
            while(val>=tar)
            {
            ans=Math.min(ans,r-l+1);
                val-=a[l];
                l++;
            }
        }
      return ans==Integer.MAX_VALUE?0:ans;  
    }
}