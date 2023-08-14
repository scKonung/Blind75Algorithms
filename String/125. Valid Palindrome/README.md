# Valid Palindrome

Link to the problem [here](https://leetcode.com/problems/valid-palindrome).

### [Solution](/String/125.%20Valid%20Palindrome/Solution.java)

```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char leftLetter = s.charAt(left);
            char rightLetter = s.charAt(right);
            if (!Character.isLetterOrDigit(leftLetter)){
                left++;
            }
            else
            if (!Character.isLetterOrDigit(rightLetter)){
                right--;
                continue;
            }
            else
           { if (leftLetter != rightLetter)
            return false;
            else{
                left++;
                right--;
            }}
        }
        return true;
    }
}

```

Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: To solve this problem i use two indexes, what start from begin and end of string. first think first check if any of characters with index is a space, if yes, we skip tis index, if not we check are a symbols
the same. If yes , we just bring next indexes, if not, we return `false`.
