class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = 0;

        for (int roll : rolls) {
            sum += roll;
        }

        int x = (mean*(m+n)) - sum;

        if (x < n || x > 6*n) {
            return new int[0];
        }
        
        int normalValue = x / n;
        int outstandingValue = x % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = normalValue + (i < outstandingValue ? 1 : 0);
        }        

        return result;
    }

    public static void main(String[] args) {
        int[] rolls = {6,3,4,3,5,3};
        int mean = 4;
        int n = 2;

        Solution solution = new Solution();
        int[] result = solution.missingRolls(rolls, mean, n);

        System.out.print("[");
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.print("]");
        
    }
}