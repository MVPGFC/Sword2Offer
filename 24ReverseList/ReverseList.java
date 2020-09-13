import java.util.List;

public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        if (head == null)
            return null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        ListNode head2 = new ListNode(11);


        System.out.println(reverseList(null));
        System.out.println(reverseList(head1).val);
        System.out.println(reverseList(head2).val);
    }

}
