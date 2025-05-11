class Solution {
    public List<Integer> zigzagTraversal(int[][] a) 
    {
        List<Integer> l=new ArrayList<>();
        int r=a.length;
        int c=a[0].length;
        int si=0,sj=c-1;
        for(int i=0;i<r;i++)
        {
            if(i%2==0){
            for(int j=si;j<c;j=j+2)
            {
                l.add(a[i][j]);
                if(j==c-1) sj=c-2;
                else sj=c-1;
            }
            }
            else{
            for(int j=sj;j>=0;j=j-2)
            {
                l.add(a[i][j]);
            }
            }
        }
        return l;
    }
}