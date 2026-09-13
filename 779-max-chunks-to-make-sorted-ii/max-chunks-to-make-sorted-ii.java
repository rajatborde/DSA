class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(arr[i], suffixMin[i + 1]);
        }

        int chunks = 0;
        int prefixMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, arr[i]);

            if (i == n - 1 || prefixMax <= suffixMin[i + 1]) {
                chunks++;
            }
        }
        return chunks;
    }
}