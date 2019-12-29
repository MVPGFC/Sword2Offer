import java.util.List;

public class FindEntryOfLoopInList {
    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        int count = 1;
        ListNode meetNode = meetNode(pHead);
        if (meetNode == null)
            return null;
        ListNode temp = meetNode.next;
        while (!temp.equals(meetNode)){
            count++;
            temp = temp.next;
        }

        ListNode front = pHead;
        ListNode back = pHead;
        while(count > 0){
            front = front.next;
            count--;
        }

        while (!front.equals(back)) {
            front = front.next;
            back = back.next;
        }

        return front;
    }
    private static ListNode meetNode(ListNode listNode) {

        if (listNode == null)
            return null;

        ListNode slow = listNode.next;
        if (slow == null)
            return null;

        ListNode fast = listNode.next.next;
        while ((fast != null) && (slow != null)) {
            if (slow.equals(fast))
                return slow;
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
            else
                return null;
        }
        return null;
    }
}
