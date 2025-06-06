class Solution {
    public int findMaxFish(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] vis = new int[r][c];
        int maxFish = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != 0 && vis[i][j] == 0) {
                    int fish = dfs(a, i, j, r, c, vis);
                    maxFish = Math.max(maxFish, fish);
                }
            }
        }
        return maxFish;
    }

    public int dfs(int[][] a, int i, int j, int r, int c, int[][] vis) {
        if (i < 0 || i >= r || j < 0 || j >= c || a[i][j] == 0 || vis[i][j] == 1)
            return 0;

        vis[i][j] = 1;
        int count = a[i][j];

        count += dfs(a, i + 1, j, r, c, vis);
        count += dfs(a, i - 1, j, r, c, vis);
        count += dfs(a, i, j + 1, r, c, vis);
        count += dfs(a, i, j - 1, r, c, vis);

        return count;
    }
}
