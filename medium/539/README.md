# 539. Minimum Time Difference

### Metrics
- Runtime: 1 ms | Beats 100.00%  
- Memory: 45.32 MB | Beats 63.32%

### Topics
Array, Math, String, Sorting

### Problem Description
Given a list of 24-hour clock time points in `"HH:MM"` format, return the minimum minutes difference between any two time-points in the list.

### Examples

#### Example 1
**Input**: `timePoints = ["23:59","00:00"]`  
**Output**: `1`

#### Example 2
**Input**: `timePoints = ["00:00","23:59","00:00"]`  
**Output**: `0`

### Constraints
- `2 <= timePoints.length <= 2 * 10^4`
- `timePoints[i]` is in the format `"HH:MM"`.
