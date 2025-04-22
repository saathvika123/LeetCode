class Solution {
    public int[] getAverages(int[] a, int k) 
    {
        int b[]=new int[a.length];
        Arrays.fill(b,-1);
        long sum=0;
        int l=0;
        for(int r=0;r<a.length;r++)
        {
            sum=sum+a[r];
            if(r-l==(2*k)+1)
            {
                sum-=a[l];
                l++;
            }
            if(r-l+1==(2*k)+1)
            {
                b[l+k]=(int)(sum/((2*k)+1));
            }
        }
        return b;
    }
}