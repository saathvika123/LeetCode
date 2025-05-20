class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int ans=0;
        int len=f.length;
        if(len==1 && n==1 && f[0]==0) return true;
        if(n==0)
        return true;
        for(int i=0;i<f.length;i++)
        {
           if(i==0)
           {
               if(f[i]==0 && f[i+1]==0)
               {
                    n--;
                    f[i]=1;
               }
           }
           else if(i==len-1)
           {
            if(f[i]==0 && f[i-1]==0 && f[i]==0)
            {
                n--;
                f[i]=1;
            }
           }
           else 
           {
            if(f[i-1]==0 &&  f[i]==0 &&f[i+1]==0)
            {
                n--;
                f[i]=1;
            }
           }
           
         if(n==0) return true;
        }
        return false;
        
    }
}