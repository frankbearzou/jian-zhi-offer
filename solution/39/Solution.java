class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int val = 0;
        int count = 0;
        for (int num : nums) {
            int cur_count = map.getOrDefault(num, 0) + 1;
            if (cur_count > count) {
                val = num;
                count = cur_count;
            }
            map.put(num, cur_count);
        }
        return val;
    }
}
