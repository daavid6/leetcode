class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode midNode, node = head;

        while (node.next != null) {
            midNode = new ListNode(gcd(node.val, node.next.val), node.next);
            node.next = midNode;
            node = midNode.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

