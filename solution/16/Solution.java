class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1.00000) {
            return 1;
        }
        double result = 1.00000;
        boolean nSign = n < 0;
        long m = n;
        m = m > 0 ? m : -m;
        while (m > 0) {
            if ((m & 1) == 1) {
                result *= x;
            }
            x *= x;
            m = m >> 1;
        }
        return nSign ? 1.00000 / result : result;
    }
}
