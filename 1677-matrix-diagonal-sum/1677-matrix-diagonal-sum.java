class Solution {
    public int diagonalSum(int[][] a) {
        int s=0;
        int r=a.length;
        for(int i=0;i<r;i++)
        {
            s+=a[i][i];
            s+=a[i][r-i-1];
        }
        if(a.length%2!=0) return s-=a[r/2][r/2];
        return s;
    }
}