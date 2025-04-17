class Solution {
    public int maxScore(int[] a, int k) {
        int n=a.length;
        int s=0;
        for(int i:a) 
            s+=i;
        int ans=0,val=Integer.MAX_VALUE;
        int l=0;
        for (int r=0;r<n;r++) {
            ans+=a[r];
            if (r-l==n-k) 
              {
                 ans-=a[l];
                 l++;
               }
            if (r-l+1==n-k)
            {
                val=Math.min(ans,val);
            }
        }

        if(k==n) return s;
        else return s-val;
    }
}
