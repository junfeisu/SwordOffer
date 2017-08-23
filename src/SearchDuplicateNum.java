import java.util.ArrayList;

/**
 * Created by sujunfei on 2017/8/23.
 * 寻找制定范围内的重复数字
 */
public class SearchDuplicateNum {
    private int upperBound;
    private int lowerBound = 0;

    // 下界限为0,上界限自定义
    public SearchDuplicateNum(int upperBoundNum) {
        upperBound = upperBoundNum;
    };

    // 下界限和上界限都自定义
    public SearchDuplicateNum(int lowerBoundNum, int upperBoundNum) {
        lowerBound = lowerBoundNum;
        upperBound = upperBoundNum;
    }

    /**
     * 查找重复元素
     * 空间复杂度O(1)，时间复杂度为O(n)
     * 会修改原数组
     */
    public ArrayList<Integer> search(int[] arr) {
        int arrLen = arr.length;
        ArrayList<Integer> duplicatedNums = new ArrayList<>();
        if (arrLen == 0 || arrLen == 1) {
            return duplicatedNums;
        }

        // 检查有没有不在规定范围内的数据
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] < lowerBound || arr[i] > arrLen - 1) {
                System.out.println(arr[i] + " is not in " + lowerBound + "~" + upperBound);
                return duplicatedNums;
            }
        }

        for (int i = 0; i < arrLen; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    duplicatedNums.add(arr[i]);
                    break;
                }

                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }

        return duplicatedNums;
    }

    // 打印重复数
    public void consoleDuplicateNum(ArrayList<Integer> duplicateNums) {
        int duplicateNumsSize = duplicateNums.size();
        if (duplicateNumsSize == 0) {
            System.out.println("There is no duplicated num");
            return;
        }

        System.out.print("Duplicated nums are ");

        for (int i = 0; i < duplicateNumsSize; i++) {
            System.out.print(duplicateNums.get(i) + " ");
        }

        System.out.println();
    }
}
