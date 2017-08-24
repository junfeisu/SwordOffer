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
        int[] preNums = {1};
        int[] inNums = {4};
        BuildBinaryTree test = new BuildBinaryTree(preNums, inNums);
        BinaryTreeNode root = null;
        root = test.build(root);
        System.out.print("中序遍历是：");
        test.consoleBinaryTreeInorder(root);
        System.out.println();
        System.out.print("前序遍历是：");
        test.consoleBinaryTreePreOrder(root);
    }
}
