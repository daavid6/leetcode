# 1367. Linked List in Binary Tree

### Metrics
- Runtime:   ms | Beats %  
- Memory: MB | Beats %

### Intuition
```

```

### Topics
Linked List, Tree, Depth-First Search, Breadth-First Search, Binary Tree

### Problem Description
Given a binary tree `root` and a linked list with `head` as the first node, return `True` if all the elements in the linked list starting from the `head` correspond to some downward path connected in the binary tree, otherwise return `False`.

In this context, a downward path means a path that starts at some node and goes downwards.

### Examples

#### Example 1
**Input**: `head = [4, 2, 8]`, `root = [1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3]`  
**Output**: `true`  
**Explanation**: Nodes in blue form a subpath in the binary tree.

#### Example 2
**Input**: `head = [1, 4, 2, 6]`, `root = [1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3]`  
**Output**: `true`

#### Example 3
**Input**: `head = [1, 4, 2, 6, 8]`, `root = [1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3]`  
**Output**: `false`  
**Explanation**: There is no path in the binary tree that contains all the elements of the linked list from the head.

### Constraints
- The number of nodes in the tree will be in the range `[1, 2500]`.
- The number of nodes in the list will be in the range `[1, 100]`.
- `1 <= Node.val <= 100` for each node in the linked list and binary tree.
