import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    private static ArrayList<Integer> printFromTailToHeadOfList(ListNode listNode) {
        Stack<Integer> nodes = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        ListNode temp = listNode;

        while (temp != null) {
            nodes.push(temp.val);
            temp = temp.next;
        }

        while (!nodes.empty()){
            res.add(nodes.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode temp = listNode;
        for (int i = 0; i < 4; i++) {
            temp.next = new ListNode(i*10);
            temp = temp.next;
        }

        temp = listNode;
        for (int i = 0; i <=4; i++) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        ArrayList arrayList = printFromTailToHeadOfList(listNode);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
