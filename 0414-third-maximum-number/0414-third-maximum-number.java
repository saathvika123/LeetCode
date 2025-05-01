class Solution {
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
       List<Integer> l=new ArrayList<>();
       for(int i:nums)
       if(!l.contains(i)) l.add(i);
       if(l.size()-3>=0)
       return l.get(l.size()-3);
       return l.get(l.size()-1);
    }
}