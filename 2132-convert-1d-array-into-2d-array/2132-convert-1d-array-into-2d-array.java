class Solution {
    public int[][] construct2DArray(int[] or, int m, int n) {
        if(m*n<or.length || m*n>or.length) return new int[][]{};
        int a[][]=new int[m][n];
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