class Solution {
    public boolean checkValid(int[][] a) {
        int r=a.length;
        for(int i=0;i<r;i++)
        {
            Map<Integer,Integer> mp=new HashMap<>();
            Map<Integer,Integer> mp1=new HashMap<>();

            for(int j=0;j<r;j++)
            {
                mp.put(a[i][j],mp.getOrDefault(a[i][j],0)+1);
                mp1.put(a[j][i],mp1.getOrDefault(a[j][i],0)+1);

            }
            
                if(mp.size()!=r || mp1.size()!=r) return false;
            
        }
        
        return true;
    }
}