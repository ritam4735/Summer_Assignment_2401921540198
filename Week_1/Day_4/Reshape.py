class Solution:
    def matrixReshape(self, matrix: list[list[int]], rows: int, cols: int) -> list[list[int]]:
        m, n = len(matrix), len(matrix[0])

        if m * n != rows * cols:
            return matrix

        result = [[0] * cols for _ in range(rows)]
        index = 0

        for i in range(m):
            for j in range(n):
                result[index // cols][index % cols] = matrix[i][j]
                index += 1

        return result