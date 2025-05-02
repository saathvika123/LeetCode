class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int s0=ele(nums);
        int s1=dig(nums);
        return Math.abs(s0-s1);
    }
    public int ele(int nums[])
    {
        int ans=0;
        for(int i:nums)
        ans+=i;
        return ans;
    }
    public int dig(int nums[])
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]>=0 && nums[i]<=9) ans+=nums[i];
        else
        {
            int n=nums[i];
            while(n>0)
            {
                ans=ans+n%10;
                n=n/10;
            }
        }
        return ans;
    }
}