import java.util.Arrays;
import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {

        int size = timePoints.size();
        int[] diffs = new int[size];
        int min=Integer.MAX_VALUE;

        for (int i=0; i<size; i++) {
            String time[] = timePoints.get(i).split(":");
            diffs[i] = Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
        }

        Arrays.sort(diffs);

        for (int i = 0 ; i < size - 1; i++) {
            min = Math.min(min, (diffs[i+1] - diffs[i]));
        }

        min = Math.min(min, (1440 + diffs[0] - diffs[size - 1]));

        return min;
    }
}