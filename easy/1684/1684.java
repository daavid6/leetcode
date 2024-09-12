class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        int result = 0;
        
        for (int i = 0; i < allowed.length(); i++) {
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }
            
        for (String word : words) {
            boolean valid = true;

            for (int i = 0; i < word.length(); i++) {
                if (!allowedChars[word.charAt(i) - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result++;
            }
        }
        
        return result;
    }
}