class Solution {
    public int[] getAverages(int[] a, int k) 
    {
        int b[]=new int[a.length];
        Arrays.fill(b,-1);
        for(int r=0;r<a.length;r++)
        {
            if(r-k>=0 && r+k<a.length && (r+k)-(r-k)+1==(2*k)+1)
            {
            long sum=0;
                for(int j=r-k;j<=r+k;j++)
                sum+=a[j];
                b[r]=(int)(sum/((2*k)+1));
            }
        }
        return b;
    }
}