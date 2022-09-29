class Solution {
    public int minArray(int[] numbers) {
        int lo = 0, hi = numbers.length - 1, mid;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (numbers[mid] > numbers[hi]) {
                lo = mid + 1;
            } else if (numbers[mid] < numbers[hi]) {
                hi = mid;
            } else {
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    min = Math.min(min, numbers[i]);
                }
                return min;
            }
        }
        return numbers[lo];
    }
}
