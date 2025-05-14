class Solution {
    public int fillCups(int[] a) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<3;i++) pq.add(a[i]);
        int c=0;
        while(pq.peek()!=0)
        {
            int r1=pq.remove();
            int r2=pq.remove();
            c++;
            pq.add(r1-1);
            pq.add(r2-1);
        }
        return c;
    }
}