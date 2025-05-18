class Solution {
    public boolean canJump(int[] nums) 
    {
        int idx=nums.length-1;
        int val=0;
        for(int i=idx-1;i>=0;i--)
        {
            if(idx-i<=nums[i]) 
            {
                idx=i;

            }

        }
        // System.out.println(idx);
        if(idx==0)
        return true; return false;
    }
}