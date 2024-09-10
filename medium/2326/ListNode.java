class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        int i, j;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                result[i][j] = -1;
            }
        }

        int x = 0;
        int y = 0;
        int maxX = n;
        int minX = 0;
        int maxY = m;
        int minY = 0;

        while (minX < maxX || minY < maxY) {
            for (; x < maxX && head != null; x++) {
                result[y][x] = head.val;
                head = head.next; 
            }
            x--; y++; minY++;

            for (; y < maxY && head != null; y++) {
                result[y][x] = head.val;
                head = head.next; 
            }
            y--; x--; maxX--;

            for (; x >= minX && head != null; x--) {
                result[y][x] = head.val;
                head = head.next; 
            }
            x++; y--; maxY--;

            for (; y >= minY && head != null; y--) {
                result[y][x] = head.val;
                head = head.next; 
            }
            y++; x++; minX++;
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

