class Solution {
    public int minTimeToType(String word) {
        char current='a';
        int ans=0;
        for(char ch:word.toCharArray())
        {
            int clockwise=Math.abs((ch-'a'+1)-(current-'a'+1));
            int anticlockwise=26-clockwise;
            int x=Math.min(clockwise,anticlockwise);
            ans+=1+x;
            current=ch;

        }
        return ans;
        
        
    }
}