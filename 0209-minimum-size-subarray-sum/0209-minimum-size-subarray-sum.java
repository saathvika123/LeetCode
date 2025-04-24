class Solution {
    public int minSubArrayLen(int tar, int[] a) {
        int l=0,ans=Integer.MAX_VALUE,val=0;
        for(int r=0;r<a.length;r++)
        {
            val+=a[r];
            while(val>=tar)
            {
                val-=a[l];
                l++;
            ans=Math.min(ans,r-l+2);
            }
        }
      return ans==Integer.MAX_VALUE?0:ans;  
    }
}