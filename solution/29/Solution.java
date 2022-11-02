class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int L = 0, R = matrix[0].length - 1, T = 0, B = matrix.length - 1;
        int index = 0;
        while (true) {
            // left to right
            for (int i = L; i <= R; i++) {
                res[index++] = matrix[T][i];
            }
            if (++T > B) {
                break;
            }
            // top to botton
            for (int i = T; i <= B; i++) {
                res[index++] = matrix[i][R];
            }
            if (--R < L) {
                break;
            }
            // right to left
            for (int i = R; i >= L; i--) {
                res[index++] = matrix[B][i];
            }
            if (--B < T) {
                break;
            }
            // botton to top
            for (int i = B; i >= T; i--) {
                res[index++] = matrix[i][L];
            }
            if (++L > R) {
                break;
            }
        }
        return res;
    }
}
