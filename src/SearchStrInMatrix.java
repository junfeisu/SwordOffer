import java.util.HashMap;

/**
 * Created by sujunfei on 2017/8/25.
 */
public class SearchStrInMatrix {
    private String[][] matrix = {};
    private int rows = 0;
    private int cols = 0;

    public SearchStrInMatrix(String[][] matrixStr) {
        if (matrixStr.length != 0 && matrixStr[0].length != 0) {
            matrix = matrixStr;
            rows = matrixStr.length;
            cols = matrixStr[0].length;
        }
    }

    public boolean hasStr(String toSearchStr) {
        if (rows <= 0 || cols <= 0 || toSearchStr == "") {
            return false;
        }

        boolean result = false;
        boolean[] visited = new boolean[rows * cols];
        int strIndex = 0;

        // 初始化访问记录矩阵
        for (int i = 0; i < rows * cols; i++) {
            visited[i] = false;
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPath(row, col, strIndex, visited, toSearchStr)) {
                    result = true;
                }
            }
        }

        return result;
    }

    public boolean hasPath(int row, int col, int strIndex, boolean[] visited, String toSearchStr) {
        if (strIndex == toSearchStr.length() - 1) {
            return true;
        }

        boolean result = false;

        if (row >= 0 && row < rows && col >= 0 && col < cols && !visited[row * cols + col] && toSearchStr.indexOf(matrix[row][col]) == strIndex) {
            strIndex++;
            visited[row * cols + col] = true;

            result = hasPath(row - 1, col, strIndex, visited, toSearchStr)
                        || hasPath(row, col + 1, strIndex, visited, toSearchStr)
                        || hasPath(row + 1, col, strIndex, visited, toSearchStr)
                        || hasPath(row, col - 1, strIndex, visited, toSearchStr);

            if (!result) {
                strIndex--;
                visited[row * cols + col] = false;
            }
        }

        return result;
    }
}
