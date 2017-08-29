/**
 * Created by sujunfei on 2017/8/23.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * 测试在指定范围内查找重复值
         */
//        int[] arr = {2, 3, 3};
//        SearchDuplicateNum test = new SearchDuplicateNum(5);
//        test.consoleDuplicateNum(test.search(arr));

        /**
         * 在升序二维数组查找数是否存在
         */
//        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
//        SearchInTwoDimensionalArray test = new SearchInTwoDimensionalArray();
//        boolean result = test.search(arr, 4, 4, 6);
//        System.out.print("result is " + result);

        /**
         * 递归实现反序打印单链表
         */
//        PrintListReverse test = new PrintListReverse();
//        ListNode head = new ListNode(1);
//        ListNode curr = null;
//        for (int i = 2; i < 6; i++) {
//            ListNode temp = new ListNode(i);
//            if (i == 2) {
//                head.next = temp;
//            } else {
//                curr.next = temp;
//            }
//            curr = temp;
//        }
//        test.recursively(head);
        /**
         * 测试根据中序和前序遍历建立二叉树
         */
//        int[] preNums = {1, 2, 4, 7, 3, 5, 6, 8};
//        int[] inNums = {4, 7, 2, 1, 5, 3, 8, 6};
//        int[] preNums = {1, 2, 4, 7};
//        int[] inNums = {4, 7, 2, 1};
//        BuildBinaryTree test = new BuildBinaryTree(preNums, inNums);
//        BinaryTreeNode root = null;
//        root = test.build(root);
//        System.out.print("中序遍历是：");
//        test.consoleBinaryTreeInorder(root);
//        System.out.println();
//        System.out.print("前序遍历是：");
//        test.consoleBinaryTreePreOrder(root);

        /**
         * 测试旋转数组的最小值
         */
//        SearchMinInSubOrder test = new SearchMinInSubOrder();
//        int[] arr = {3, 5, 7, 1, 2, 3};
//        System.out.print("最小值是：" + test.min(arr));

        /**
         * 测试矩阵中查找是否有某个字符串的路径
         */
//        String[][] martix = {{"t", "e", "s", "t"}, {"1", "s", "a", "t"}};
//        SearchStrInMatrix test = new SearchStrInMatrix(martix);
//        String str = "test";
//        System.out.println("是否有路径: " + test.hasStr(str));

        /**
         * 测试机器人可移动的位置数
         */
//        int[][] martix = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
//        int[][] martix= {{}};
//        RobotMoving test = new RobotMoving(martix);
//        System.out.println("可移动的位置有" + test.moveAbleBoxNum(6) + "个");

        /**
         * 测试剪绳子
         */
        CutRope test = new CutRope();
        System.out.println(test.cutWithGreed(14));
        System.out.println(test.cut(7));
    }
}
