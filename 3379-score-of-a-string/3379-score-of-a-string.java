class Solution {
    public int scoreOfString(String s) {
        int i=1,si=0;
        while(i<s.length()){
        si=si+(Math.abs(s.charAt(i)-s.charAt(i-1)));i++;
        }
        return si;
    }
}