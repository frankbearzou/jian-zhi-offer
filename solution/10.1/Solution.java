class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1, c = 0;
        while (n > 1) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
            n--;
        }

        return c;
    }
}
