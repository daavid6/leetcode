import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> wordCount = new HashMap<>();

        String[] words1 = s1.split(" ");
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        String[] words = s2.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> array = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                array.add(entry.getKey());
            }
        }

        return array.toArray(new String[array.size()]);
    }
}