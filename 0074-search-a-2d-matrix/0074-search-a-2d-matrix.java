class Solution {
    public boolean searchMatrix(int[][] a, int target) 
    {
        int r=a.length;
        int c=a[0].length;
        int low=0,high=(r*c)-1;
        while(low<=high)
        { 
            int mid=(low+high)/2;
            int row=mid/c;
            int col=(mid%c);
            if(a[row][col]==target)
            {
                return true;
            }
            else if(a[row][col]>target)
            high=mid-1;
            else 
            low=mid+1;
        }
        return false;
    }
}