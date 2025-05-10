class Solution {
    public int[][] construct2DArray(int[] or, int m, int n) {
        int a[][]=new int[m][n];
        if(m*n<or.length) return new int[][]{};
        if(m*n>or.length) return new int[][]{};
        int idx=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=or[idx++];
            }
        }return a;
    }
}