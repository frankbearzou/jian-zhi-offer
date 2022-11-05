class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder, 0, postorder.length - 1);
    }

    private boolean verifyPostorder(int[] postorder, int left, int right) {
        if (left >= right) {
            return true;
        }
        // m is first right branch
        int m = left;
        while (postorder[m] < postorder[right]) {
            m++;
        }
        // is all right branch values greater than root
        for (int i = m; i < right; i++) {
            if (postorder[i] < postorder[right]) {
                return false;
            }
        }

        return verifyPostorder(postorder, left, m - 1) && verifyPostorder(postorder, m, right - 1);
    }
}
