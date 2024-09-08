class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        int loop, j;
        ListNode aux = head;
        ListNode[] result = new ListNode[k];

        while (aux != null) {
            aux = aux.next;
            length++;
        }

        int base = length / k;
        int complement = length % k;

        for (int i = 0; i < k; i++) {
            result[i] = head;

            loop = base + (complement > 0 ? 1 : 0);
            complement--;
            
            for (j = 1; j < loop; j++) {
                if (head == null) {
                    break;
                }

                head = head.next;
            }

            if (head == null) {
                break;
            }

            aux = head.next;
            head.next = null;
            head = aux;
        }

        return result;
    }
    

    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
}