class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        if(n==0) return true;
        if(a.length==1) 
        {
            if(a[0]==1 && n==0)
            return true;
            else if(a[0]==1&&n!=0)
             return false;
             else if(a[0]==0 && n==1) return true;
             return false;

        }
        for(int j=0;j<a.length;j++)
        {
            if(j==0) 
            {
                if(a[j+1]==0 && a[j]==0)
                {
                n--;
                a[j]=1;
                }
            }
            
            else if(j==a.length-1) 
            {
                if(a[j]==0 && a[j-1]==0)
                {
                a[j]=1;
                n--;
                }
            }
                        
            else if(a[j]==0 && a[j-1]==0 && a[j+1]==0)
            {
                a[j]=1;
                n--;
            }
                    if(n==0) return true;

        }
        return false;
    }
}