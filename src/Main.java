/**
 * Created by sujunfei on 2017/8/23.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 测试在指定范围内查找重复值
         */
//        int[] arr = {2, 3, 3};
//        SearchDuplicateNum test = new SearchDuplicateNum(5);
//        test.consoleDuplicateNum(test.search(arr));

        /**
         * 在升序二维数组查找数是否存在
         */
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        SearchInTwoDimensionalArray test = new SearchInTwoDimensionalArray();
        boolean result = test.search(arr, 4, 4, 6);
        System.out.print("result is " + result);
    }
}
