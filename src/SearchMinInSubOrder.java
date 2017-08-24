/**
 * Created by sujunfei on 2017/8/24.
 */
public class SearchMinInSubOrder {
    public int min(int[] arr) throws Exception {
        int arrLen = arr.length;
        if (arrLen == 0) {
            throw new Exception("Invalid input");
        }

        int index1 = 0;
        int index2 = arrLen - 1;
        int midIndex = index1;

        while (arr[index1] >= arr[index2]) {
            if (index2 - index1 == 1) {
                midIndex = index2;
                break;
            }

            midIndex = (index1 + index2) / 2;
            if (arr[index1] == arr[index2] && arr[midIndex] == arr[index1]) {
                return midInOrder(arr, index1, index2);
            }

            if (arr[index1] <= arr[midIndex]) {
                index1 = midIndex;
            } else if (arr[midIndex] <= arr[index2]) {
                index2 = midIndex;
            }
        }

        return arr[midIndex];
    }

    public int midInOrder(int[] arr, int index1, int index2) {
        int result = arr[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }

        return result;
    }
}
