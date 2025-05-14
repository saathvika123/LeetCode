class Solution {
public int minTimeToType(String word) {
    char current = 'a'; // Start at 'a'
    int ans = 0;        // Total time

    for (char ch : word.toCharArray()) {
        // Distance when moving clockwise
        int clockwise = Math.abs((ch - 'a') - (current - 'a'));

        // Distance when moving counterclockwise
        int anticlockwise = 26 - clockwise;

        // Choose the shorter path
        int x = Math.min(clockwise, anticlockwise);

        // Add time: move time (x) + type time (1)
        ans += x + 1;

        // Update the current pointer position
        current = ch;
    }

    return ans;
}

}