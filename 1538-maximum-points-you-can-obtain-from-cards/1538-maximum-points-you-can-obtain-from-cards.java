class Solution {
    public int maxScore(int[] a, int k) {
        int n = a.length;
        int totalSum = 0;

        for (int num : a) {
            totalSum += num;
        }

        // Find the minimum sum of subarray of length n - k
        int windowSum = 0, minSubarraySum = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < n; r++) {
            windowSum += a[r];

            // When window size exceeds n - k
            if (r - l + 1 > n - k) {
                windowSum -= a[l];
                l++;
            }

            if (r - l + 1 == n - k) {
                minSubarraySum = Math.min(minSubarraySum, windowSum);
            }
        }

        return totalSum - (n == k ? 0 : minSubarraySum);
    }
}
