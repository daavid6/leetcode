import java.util.Arrays;

class Solution {
    public int findTheLongestSubstring(String s) {
        int maxLen = 0;
        int mask = 0;

        int[] mapy = new int[32];
        Arrays.fill(mapy, -2);
        mapy[0] = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            switch (character) {
                case 'a':
                    mask ^= 0b00001;
                    break;
                case 'e':
                    mask ^= 0b00010;
                    break;
                case 'i':
                    mask ^= 0b00100;
                    break;
                case 'o':
                    mask ^= 0b01000;
                    break;
                case 'u':
                    mask ^= 0b10000;
                    break;
            }

            int prev = mapy[mask];
            
            if (prev == -2) {
                mapy[mask] = i;
            } else {
                maxLen = Math.max(maxLen, i - prev);
            }
        }

        return maxLen;
    }
}