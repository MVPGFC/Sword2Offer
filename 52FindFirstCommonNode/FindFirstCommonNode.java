public class FindFirstCommonNode {

    public static ListNode findFirstCommonNode(ListNode head1, ListNode head2) {

        if (head1 == null || head2 == null)
            return null;

        int length1 = 1;
        int length2 = 1;
        ListNode cur1 = head1; //长
        ListNode cur2 = head2; //短

        while (cur1.next != null) {
            cur1 = cur1.next;
            length1++;
        }

        while (cur2.next != null) {
            cur2 = cur2.next;
            length2++;
        }

        if (cur1 != cur2)
            return null;

        int nStep = Math.abs(length1 - length2);
        cur1 = length1 > length2 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;

        while (nStep-- != 0) {
            cur1 = cur1.next;
        }

        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return cur1;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(11);
        //head2.next = head1.next.next;

        System.out.println(findFirstCommonNode(head1, head2).val);
    }

}
