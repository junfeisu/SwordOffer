/**
 * Created by sujunfei on 2017/8/24.
 */
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class PrintListReverse {
    public void recursively(ListNode head) {
        if (head != null) {
            if (head.next != null) {
                recursively(head.next);
            }

            System.out.print(head.val + "<-");
        }
    }
}
