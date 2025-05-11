class Solution {
    public boolean searchMatrix(int[][] a, int t) 
    {
        int r=0,c=a[0].length-1;
        while(r<a.length&& c>=0)
        {
            if(a[r][c]==t) return true;
            else if(a[r][c]<t) r++;
            else c--;

        }
        return false;
    }
}