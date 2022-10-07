public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int val = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & val) > 0) {
                res++;
            }
            val = val << 1;
        }
        return n >= 0 ? res : res + 1;
    }
}
