# Merge Two Sorted Lists

Link to the problem [here](https://leetcode.com/problems/merge-two-sorted-lists/).

### [Solution](/Linked%20List/21.%20Merge%20Two%20Sorted%20Lists/Solution.java)

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if (list1 == null)
        return list2;
        else if (list2 == null)
        return list1;
        if (list1.val == list2.val)
            result = new ListNode(list1.val, new ListNode(list2.val, mergeTwoLists(list1.next,list2.next)));
        else if (list1.val < list2.val)
            result = new ListNode(list1.val, mergeTwoLists(list1.next,list2));
        else
            result = new ListNode(list2.val, mergeTwoLists(list1,list2.next));
        return result;
    }
}
```
Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: Simple recursion, where we compare values of `ListNode` and then add smaller value to current `result` and for the next `ListNode` in the constructor we search next value with recursion.
