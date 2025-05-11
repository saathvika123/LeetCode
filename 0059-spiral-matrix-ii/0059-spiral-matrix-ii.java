class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int val=1;
        int rowBegin=0,rowEnd=n-1,colBegin=0,colEnd=n-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd)
        {
        for(int i=colBegin;i<=colEnd;i++)
        {
            a[rowBegin][i]=val++;
        }
        rowBegin++;
        for(int i=rowBegin;i<=rowEnd;i++)
            {
                a[i][colEnd]=val++;
            }
            colEnd--;

            if(rowBegin<=rowEnd)
            {
            for(int i=colEnd;i>=colBegin;i--)
            {
                a[rowEnd][i]=val++;
            }
            rowEnd--;
            }
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--)
            {
                a[i][colBegin]=val++;
            }
            colBegin++;
            }
        }return a;
    }
}