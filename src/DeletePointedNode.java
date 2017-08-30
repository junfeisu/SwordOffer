/**
 * Created by sujunfei on 2017/8/30.
 */
public class DeletePointedNode {
    public ListNode deleteNode(ListNode head, ListNode pointedNode) {
        if (head == null || pointedNode == null) {
            return head;
        }

        if (head == pointedNode) {
            head = head.next;
        } else if (pointedNode.next != null) {
            ListNode pointNextNode = pointedNode.next;
            pointedNode.val = pointNextNode.val;
            pointedNode.next = pointNextNode.next;
        } else if (pointedNode.next == null) {
            ListNode walkNode = head;
            while (walkNode.next != null) {
                if (walkNode.next.next == null) {
                    break;
                }
                walkNode = walkNode.next;
            }
            walkNode.next = pointedNode.next;
        }

        return head;
    }

    public void consoleSingleList(ListNode head) {
        if (head == null) {
            System.out.print("这是一个空表");
        } else {
            ListNode walkNode = head;
            while (walkNode != null) {
                System.out.print(walkNode.val + "->");
                walkNode = walkNode.next;
            }
        }
    }
}
