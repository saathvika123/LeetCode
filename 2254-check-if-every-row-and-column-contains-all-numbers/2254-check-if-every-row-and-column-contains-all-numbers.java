class Solution {
    public boolean checkValid(int[][] a) {
        int r=a.length;
        for(int i=0;i<r;i++)
        {
            Set<Integer> mp=new HashSet<>();
            Set<Integer> mp1=new HashSet<>();

            for(int j=0;j<r;j++)
            {
                mp.add(a[i][j]);
                mp1.add(a[j][i]);

            }
            
                if(mp.size()!=r || mp1.size()!=r) return false;
            
        }
        
        return true;
    }
}