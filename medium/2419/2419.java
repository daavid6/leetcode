class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int minIndex = 0, maxIndex = 0, maxLength = 1;
        
        for (int i = 1; i < nums.length; i++) {
            int aux = nums[i];

            if (max > aux) {
                continue;
            }

            if (max < aux) {
                max = aux;
                maxLength = 1;
                minIndex = i;
                maxIndex = i;
                continue;
            }

            if (maxIndex == (i-1)) {
                maxIndex++;
            } else {
                aux = ((maxIndex - minIndex) + 1);

                if (aux > maxLength) {
                    maxLength = aux;
                }

                minIndex = i;
                maxIndex = i;
            }                    
        }

        if (((maxIndex - minIndex) + 1) > maxLength) {
            maxLength = ((maxIndex - minIndex) + 1);
        }

        return maxLength;
    }
}