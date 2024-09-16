# 1371. Find the Longest Substring Containing Vowels in Even Counts

### Metrics
- Runtime: 11 ms | Beats 87.19%  
- Memory: 45.52 MB | Beats 51.60%

### Intuition
At each character in the string, we track the parity of each vowel's occurrence using a bitmask. The key insight is that if two positions in the string have the same bitmask, the substring between them contains an even number of each vowel. Therefore, by comparing the bitmasks, we can determine the maximum length of such substrings.

### Topics
Hash Table, String, Bit Manipulation, Prefix Sum

### Problem Description
Given the string `s`, return the size of the longest substring containing each vowel an even number of times. That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.

### Examples

#### Example 1
**Input**: `s = "eleetminicoworoep"`  
**Output**: `13`  
**Explanation**: The longest substring is `"leetminicowor"` which contains two each of the vowels: 'e', 'i', and 'o', and zero of the vowels: 'a' and 'u'.

#### Example 2
**Input**: `s = "leetcodeisgreat"`  
**Output**: `5`  
**Explanation**: The longest substring is `"leetc"` which contains two 'e's.

#### Example 3
**Input**: `s = "bcbcbc"`  
**Output**: `6`  
**Explanation**: In this case, the given string `"bcbcbc"` is the longest because all vowels: 'a', 'e', 'i', 'o', and 'u' appear zero times.

### Constraints
- `1 <= s.length <= 5 x 10^5`
- `s` contains only lowercase English letters.
