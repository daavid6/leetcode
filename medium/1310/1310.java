class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int[] xorArray = new int[arr.length];

        xorArray[0] = arr[0];

        for (int i = 1; i < xorArray.length; i++) {
            xorArray[i] = xorArray[i-1] ^ arr[i];
        }

        for(int i = 0; i < queries.length; i++){
            if (queries[i][0] == 0) {
                result[i] = xorArray[queries[i][1]];
            } else {
                result[i] = xorArray[queries[i][1]] ^ xorArray[queries[i][0] - 1];
            }
        }

        return result;
    }
}