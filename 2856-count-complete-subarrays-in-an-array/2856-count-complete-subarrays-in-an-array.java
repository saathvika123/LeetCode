class Solution {
    public int countCompleteSubarrays(int[] a) 
    {
        Map<Integer,Integer> mp=new HashMap<>();
        Map<Integer,Integer> mp1=new HashMap<>();
        for(int i=0;i<a.length;i++)
mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        int l=0,c=0;
        for(int r=0;r<a.length;r++)
        {
          mp1.put(a[r], mp1.getOrDefault(a[r], 0) + 1);
            while(mp1.size()==mp.size())
            {
                c+=(a.length-r);
                int v=mp1.get(a[l]);
                v--;
                mp1.put(a[l],v);
                if(v==0) mp1.remove(a[l]);
                l++;
            }

        }    
        return c;
    }
}