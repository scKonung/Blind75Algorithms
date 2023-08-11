# Merge k Sorted Lists

Link to the problem [here](https://leetcode.com/problems/merge-k-sorted-lists/).

### [Solution](/Heap/23.%20Merge%20k%20Sorted%20Lists/Solution.java)

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
    public ListNode mergeKLists(ListNode[] l) {
        ArrayList<ListNode> list = new ArrayList<>();
        for (int i =0; i< l.length;i++)
        {
            if(l[i] != null)
             list.add(l[i]);
        }

        if(list.size() == 0)
        return null;
        else if (list.size() == 1)
        return list.get(0);

        int i = 0;
        return method(list , i);
    }
    
    public ListNode method(ArrayList<ListNode> list, int index){
        if (list.get(index) == null)
        list.remove(index);
        if (list.size() == 1)
        return list.get(0);
        int val = Integer.MAX_VALUE;
        for (int i =0; i < list.size();i++){

            if (list.get(i).val < val){
                val = list.get(i).val;
                index = i;
            }
        }
        list.set(index, list.get(index).next);

        return new ListNode(val ,method(list, index));
    }
}
```

Time Complexity: ![O(n^2)](<https://latex.codecogs.com/svg.image?\inline&space;O(n^2)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: TODO
