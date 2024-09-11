# 2807. Insert Greatest Common Divisors in Linked List

### Metrics
- Runtime: 2 ms | Beats 71.10%  
- Memory: 44.87 MB | Beats 77.43%

### Topics
Linked List, Math, Number Theory

### Problem Description
Given the head of a linked list `head`, in which each node contains an integer value, insert a new node with a value equal to the greatest common divisor (GCD) of every pair of adjacent nodes.

Return the linked list after the insertion.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

### Examples

#### Example 1
**Input**: `head = [18, 6, 10, 3]`  
**Output**: `[18, 6, 6, 2, 10, 1, 3]`  
**Explanation**: 
- Insert the GCD of `18` and `6` = `6` between the 1st and 2nd nodes.
- Insert the GCD of `6` and `10` = `2` between the 2nd and 3rd nodes.
- Insert the GCD of `10` and `3` = `1` between the 3rd and 4th nodes.

#### Example 2
**Input**: `head = [7]`  
**Output**: `[7]`  
**Explanation**: There are no adjacent nodes, so the initial linked list is returned.

### Constraints
- The number of nodes in the list is in the range `[1, 5000]`.
- `1 <= Node.val <= 1000`
