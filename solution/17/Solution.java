class Solution {
    public int[] printNumbers(int n) {
        int size = 1;
        for (int i = 0; i < n; i++) {
            size = size * 10;
        }
        // n = 1, size = 9
        // n = 2, size = 99
        // n = 3, size = 999
        size--;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res [i] = i + 1;
        }
        return res;
    }
}
