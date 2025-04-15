class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int count[]=new int[a.length+1];
        for(int i:a)
        {
            count[i]=i;
        }
        List<Integer> l=new ArrayList<>();
        for(int j=1;j<count.length;j++)
        {
            if(count[j]==0)
            l.add(j);
        }return l;
    }
}