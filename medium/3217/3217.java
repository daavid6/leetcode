
import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode before = null, after;
        
        for (int num : nums) {
            set.add(num);
        }

        after = head;

        while (after != null) {
            if (!set.contains(after.val)){
                before = after;
            } 

            after = after.next;

            if (before == null) {
                head = after;
            } else {
                before.next = after;
            }
        }
        
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}