class Solution {
    public int[][] transpose(int[][] a) {
        int r=a.length;
        int c=a[0].length;
        int b[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                b[i][j]=a[j][i];
            }

        }return b;
    }
}