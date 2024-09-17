import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0;

        boolean[] times = new boolean[1440]; 

        for (String time : timePoints) {
            int minutes = convertToMinutes(time);

            if (times[minutes]) {
                return 0;
            } else {
                times[minutes] = true;
            } 
        }

        int first = Integer.MAX_VALUE;
        int prev = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < 1440; i++) {
            if (times[i]) {
                if (first == Integer.MAX_VALUE) {
                    first = i;
                } else {
                    minDiff = Math.min(minDiff, i - prev);
                }
                prev = i;
            }
        }
        
        minDiff = Math.min(minDiff, 1440 - prev + first);
        
        return minDiff;
    }

    private int convertToMinutes(String time) {
        return ((time.charAt(0) - '0') * 10 + (time.charAt(1) - '0')) * 60 + (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }
}