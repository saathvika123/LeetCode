class Solution {
    public void setZeroes(int[][] a) 
    {
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==0) 
                {
                    l.add(i);
                    l1.add(j);
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               if(l.contains(i)||l1.contains(j)) a[i][j]=0;
            }
        }
    }
}