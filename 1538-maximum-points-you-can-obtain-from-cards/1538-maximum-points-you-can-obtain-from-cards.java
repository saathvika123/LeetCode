class Solution {
    public int maxScore(int[] a, int k) {
        int n=a.length;
        int s=0;
        for(int i:a) 
            s+=i;
        int windowSum=0,minSubarraySum=Integer.MAX_VALUE;
        int l=0;
        for (int r=0;r<n;r++) {
            windowSum+=a[r];
            if (r-l==n-k) 
              {
                 windowSum -= a[l];
                 l++;
               }

            if (r-l+1==n-k)
            {
                minSubarraySum=Math.min(minSubarraySum,windowSum);
            }
        }

        if(k==n) return s;
        else return s-minSubarraySum;
    }
}
