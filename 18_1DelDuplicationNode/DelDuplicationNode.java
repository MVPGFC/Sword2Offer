import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class DelDuplicationNode {

    public ListNode deleteDuplication(ListNode pHead)
    {
        // 非递归思路
        if(pHead == null || pHead.next == null) return pHead;
        ListNode Head = new ListNode(-1);
        Head.next = pHead;
        ListNode pre = Head;
        ListNode cur = Head.next;
        while(cur != null){
            if(cur.next!=null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur.next;
            }else{
                pre = pre.next;
            }
            cur = cur.next;
        }
        return Head.next;
    }

    public ListNode deleteDuplication1(ListNode pHead)
    {
        if (pHead == null)
            return null;
        ListNode pre = pHead;
        ListNode cur = pHead.next;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(pre.val,1);
        while (cur != null) {
            if (hashMap.get(cur.val) != null) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                hashMap.put(cur.val, 1);
                pre = cur;
                cur = cur.next;
            }
        }
        return pHead;
    }

    public ListNode deleteDuplication2(ListNode pHead)
    {
        if (pHead == null)
            return null;
        ListNode temp = pHead;

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        while ( temp != null) {
            if (map1.get(temp.val) != null){
                map2.put(temp.val,1);
            }else {
                map1.put(temp.val,1);
            }
            temp = temp.next;
        }

        while (map2.get(pHead.val) != null && pHead.next != null) {
            pHead = pHead.next;
            if(pHead == null){
                return null;
            }
        }

        ListNode pre = new ListNode(-1);
        ListNode cur = pHead;
        pre.next = cur;
        while (cur != null) {
            if (map2.get(cur.val) != null) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        return pHead;
    }

}
