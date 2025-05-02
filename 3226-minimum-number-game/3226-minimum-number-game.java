class Solution {
    public int[] numberGame(int[] nums) {
       int a[]=new int[nums.length]; 
       int k=0;
       Arrays.sort(nums);
       int i=0,j=1;
       while(j<nums.length)
       {
        a[k++]=nums[j];
        j+=2;
        a[k++]=nums[i];
        i+=2;
       }
       return a;
    }
}