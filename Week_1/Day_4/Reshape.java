class Solution {
    public int[][] matrixReshape(int[][] matrix, int rows, int cols) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (m * n != rows * cols) return matrix;

        int[][] result = new int[rows][cols];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[index / cols][index % cols] = matrix[i][j];
                index++;
            }
        }

        return result;
    }
}