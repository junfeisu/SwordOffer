/**
 * Created by sujunfei on 2017/8/24.
 * 根据中序遍历和前序遍历重建二叉树
 */
class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BuildBinaryTree {
    private int[] preOrders;
    private int[] inOrders;

    public BuildBinaryTree(int[] preOrderNums, int[] inOrderNums) {
        preOrders = preOrderNums;
        inOrders = inOrderNums;
    }

    public BinaryTreeNode build(BinaryTreeNode root) throws Exception {
        int preOrdersLen = preOrders.length;
        int inOrdersLen = inOrders.length;
        if (preOrdersLen == 0 || inOrdersLen == 0 || preOrdersLen != inOrdersLen) {
            return null;
        }

        root = build_resursively(0, preOrdersLen - 1, 0, inOrdersLen - 1);

        return root;
    }

    public BinaryTreeNode build_resursively(int preStart, int preEnd, int inStart, int inEnd) throws Exception {
        BinaryTreeNode parent = new BinaryTreeNode(preOrders[preStart]);

        // 只有一个父节点，没有子节点
        if (preStart == preEnd) {
            if (inStart == inEnd && preOrders[preStart] == inOrders[inStart]) {
                return parent;
            } else {
                throw new Exception("the input is not valid");
            }
        }

        int inOrderRootIndex = inStart;
        while (inOrderRootIndex < inEnd && inOrders[inOrderRootIndex] != parent.val) {
            inOrderRootIndex++;
        }

        if (inOrderRootIndex == inEnd && inOrders[inOrderRootIndex] != parent.val) {
            throw new Exception("the input is not valid");
        }

        int leftLen = inOrderRootIndex - inStart;
        int preLeftLastIndex = preStart + leftLen;

        if (leftLen > 0) {
            parent.left = build_resursively(preStart + 1, preLeftLastIndex, inStart, inOrderRootIndex - 1);
        }
        if (leftLen < preEnd - preStart) {
            parent.right = build_resursively(preLeftLastIndex + 1, preEnd, inOrderRootIndex + 1, inEnd);
        }

        return parent;
    }

    public void consoleBinaryTreePreOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            consoleBinaryTreePreOrder(root.left);
            consoleBinaryTreePreOrder(root.right);
        }
    }

    public void consoleBinaryTreeInorder(BinaryTreeNode root) {
        if (root != null) {
            consoleBinaryTreeInorder(root.left);
            System.out.print(root.val + " ");
            consoleBinaryTreeInorder(root.right);
        }
    }
}
