class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int v=s.charAt(i);
            int v1=s.charAt(i+1);
            if(v-v1!=0 && Math.abs(v-v1)!=32) c++;
        }return c;
    }
}