class Solution {
    public int countSegments(String s) {
        if(s==null || s.trim().equals("")) return 0;
      String ch[]=s.trim().split("\\s+");
      return ch.length; 
    }
}