/**
 * Created by sujunfei on 2017/8/30.
 */
public class DeleteDuplicateNode {
    public ListNode delete(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pNode = head;
        ListNode preNode = null;

        while (pNode != null) {
            ListNode pNext = pNode.next;
            boolean isDuplicate = false;

            if (pNext != null && pNext.val == pNode.val) {
                isDuplicate = true;
            }

            if (isDuplicate == true) {
                int value = pNode.val;
                ListNode pToBeDeleteNode = pNode;
                while (pToBeDeleteNode != null && pToBeDeleteNode.val == value) {
                    pNext = pToBeDeleteNode.next;
                    pToBeDeleteNode = pNext;
                }

                if (preNode == null) {
                    head = pNext;
                } else {
                    preNode.next = pNext;
                }
                pNode = pNext;
            } else {
                preNode = pNode;
                pNode = pNode.next;
            }
        }

        return head;
    }

    public void consoleSingleList(ListNode head) {
        if (head == null) {
            System.out.println("这是一个空表");
            return;
        }

        ListNode walkNode = head;
        while (walkNode != null) {
            System.out.print(walkNode.val + "->");
            walkNode = walkNode.next;
        }

        System.out.println();
    }
}
