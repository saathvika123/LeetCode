class Solution {
    public List<Integer> spiralOrder(int[][] a) 
    {
        int r=a.length;
        int c=a[0].length;
        List<Integer> l=new ArrayList<>();
        int colBegin=0,colEnd=c-1,rowBegin=0,rowEnd=r-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd)
        {
            for(int i=colBegin;i<=colEnd;i++)
            {
                l.add(a[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                l.add(a[i][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd)
            {
            for(int i=colEnd;i>=colBegin;i--)
            {
                l.add(a[rowEnd][i]);
            }
            rowEnd--;
            }
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--)
            {
                l.add(a[i][colBegin]);
            }
            colBegin++;
            }
        }return l;
    }
}