class Solution {
    public int removeDuplicates(int[] a) {
        Set<Integer> st=new TreeSet<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            st.add(a[i]);
        }
        int k=st.size();
        int x=0;
        for(int j:st)
        {
            a[x++]=j;
        }
        return k;
    }
}