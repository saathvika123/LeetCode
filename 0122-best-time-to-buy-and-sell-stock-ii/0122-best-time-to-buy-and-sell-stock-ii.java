class Solution {
    public int maxProfit(int[] a) 
    {
        int mn=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]>a[i]) mn+=a[i+1]-a[i];
        }
        return mn;
    }
}