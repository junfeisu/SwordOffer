/**
 * Created by sujunfei on 2017/8/25.
 */
public class RobotMoving {
    private int[][] matrix = {};
    private int rows = 0;
    private int cols = 0;

    public RobotMoving(int[][] matrixNum) {
        if (matrixNum.length != 0 && matrixNum[0].length != 0) {
            matrix = matrixNum;
            rows = matrixNum.length;
            cols = matrixNum[0].length;
        }
    }

    public int moveAbleBoxNum(int k) {
        if (rows <= 0 || cols <= 0 || k < 0) {
            return 0;
        }

        int num = 0;
        boolean[] visited = new boolean[rows * cols];

        for (int i = 0; i < rows * cols; i++) {
            visited[i] = false;
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int calNum = calculateNum(row, col, visited, k);
                if (calNum > 0) {
                    num = calNum;
                }
            }
        }

        return num;
    }

    // 递归计算可以移动的位置数
    public int calculateNum(int row, int col, boolean[] visited, int k) {
        int count = 0;
        if (check(row, col, k, visited)) {
            visited[row * cols + col] = true;
            count = 1 + calculateNum(row, col - 1, visited, k)
                        + calculateNum(row - 1, col, visited, k)
                        + calculateNum(row, col + 1, visited, k)
                        + calculateNum(row + 1, col, visited, k);
        }


        return count;
    }

    // 判断一个位置是否可以移动
    public boolean check(int row, int col, int k, boolean[] visited) {
        boolean moveAble = false;
        int rowDigitSum = getDigitSum(row);
        int colDigitSum = getDigitSum(col);
        if (row >= 0 && row < rows && col >= 0 && col < cols && !visited[row * cols + col] && rowDigitSum + colDigitSum <= k) {
            moveAble = true;
        }

        return moveAble;
    }

    // 计算一个整数的数位之和
    public int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }
}
