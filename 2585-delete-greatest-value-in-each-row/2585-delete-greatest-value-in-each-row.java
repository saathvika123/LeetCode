class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int row[]:grid)
        {
            Arrays.sort(row);
        }
        int sum=0;
        for(int j=0;j<c;j++)
        {
            int mn=Integer.MIN_VALUE;
            for(int i=0;i<r;i++)
            {
                mn=Math.max(mn,grid[i][j]);
            }
            sum+=mn;
        }
        return sum;
    }
}