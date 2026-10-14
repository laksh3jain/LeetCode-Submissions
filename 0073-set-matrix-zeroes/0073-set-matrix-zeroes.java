class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) return;
        int col0 = 0;
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) if (matrix[i][j] == 0) {
            if (j == 0) {
                col0 = 1;
                continue;
            }
            matrix[0][j] = 0;
            matrix[i][0] = 0;
        }
        for (int i = m - 1; i >= 0; i--) for (int j = 1; j < n; j++) if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
        if (col0 == 1) for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }
}