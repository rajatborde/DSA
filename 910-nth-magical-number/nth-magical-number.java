class Solution {
    public int nthMagicalNumber(int n, int a, int b) {

        long MOD = 1000000007L;

        long l = Math.min(a, b);
        long r = (long) n * l;
        long x = Math.abs((long) a);
        long y = Math.abs((long) b);

        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        long lcm = ((long) a * b) / x;

        while (l < r) {
            long mid = l + (r - l) / 2;
            long m = mid / a + mid / b - mid / lcm;
            if (m >= n)
                r = mid;
            else
                l = mid + 1;
        }
        return (int) (l % MOD);
        
    }
}