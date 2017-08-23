/**
 * Created by sujunfei on 2017/8/23.
 * 在从左到右，从上到下升序的二维数组查找指定数
 */
public class SearchInTwoDimensionalArray {
    /**
     * @param arr 就是二维数组
     * @param columns 是二维数组的列数，rows是行数
     * @param num 就是带查找的数字
     */
    public boolean search(int[][] arr, int columns, int rows, int num) {
        if (columns > 0 && rows > 0 && (num < arr[0][0] || num > arr[rows - 1][columns - 1])) {
            return false;
        } else if (rows <= 0 || columns <= 0) {
            return false;
        }

        boolean result = false;
        int row = 0;

        while (columns > 0 && row < rows) {
            if (arr[row][columns - 1] > num) {
                columns--;
            } else if (arr[row][columns - 1] > num) {
                row++;
            } else {
                result = true;
                break;
            }
        }

        return result;
    }
}
