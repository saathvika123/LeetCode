class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
        if(!pq.contains(i)) pq.add(i);
         if(pq.size()-3>=0)
       {
        pq.remove();
        pq.remove();
        return pq.remove();
       }
       return pq.remove();
    }
}