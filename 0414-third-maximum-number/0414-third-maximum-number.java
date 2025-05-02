class Solution {
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
       TreeSet<Integer> s=new TreeSet<>();
       for(int i:nums)
       s.add(i);
       if(s.size()-3>=0)
       {
        s.pollLast();
        s.pollLast();
        return s.pollLast();
       }
       return s.pollLast();
    }
}