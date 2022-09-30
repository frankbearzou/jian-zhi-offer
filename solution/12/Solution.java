class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (bfs(board, word, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean bfs(char[][] board, String word, boolean[][] visited, int i, int j, int level) {
        if (board[i][j] != word.charAt(level)) {
            return false;
        }
        if (level == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int d = 0; d < 4; d++) {
            int newI = i + dir[d][0];
            int newJ = j + dir[d][1];
            if (newI >= 0 && newI < board.length && newJ >= 0 && newJ < board[0].length) {
                if (!visited[newI][newJ]) {
                    if (bfs(board, word, visited, newI, newJ, level + 1)) {
                        visited[i][j] = false;
                        return true;
                    }
                }
            }
            
        }
        visited[i][j] = false;
        return false;
    }
}
