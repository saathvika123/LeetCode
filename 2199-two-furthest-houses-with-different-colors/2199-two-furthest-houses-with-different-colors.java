class Solution {
    public int maxDistance(int[] a) {
        int ans=-1,i=0,j=1;
        while(i<a.length &&j<a.length)
        {
            if(a[i]!=a[j])
            {
                ans=Math.max(ans,Math.abs(i-j));
                j++;
            }
           else if(a[i]==a[j])
                j++;
            if(j>=a.length)
            {
                i++;
                j=i+1;
            }
           
            
        }return ans;
    }
}