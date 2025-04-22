class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(y-z)==Math.abs(x-z)) return 0;
                if(Math.abs(y-z)>Math.abs(x-z)) return 1;

        if(Math.abs(y-z)<Math.abs(x-z)) return 2;
        return 2;
    }
}