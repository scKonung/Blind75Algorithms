# Valid Parentheses

Link to the problem [here](https://leetcode.com/problems/valid-parentheses/).

### [Solution](/Stack/20.%20Valid%20Parentheses/Solution.java)

```java
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
        return false;
        ArrayList<Character> branches = new ArrayList<Character>();
        for (int i =0 ; i < s.length(); i++){
            Character branche = s.charAt(i);
            switch (branche) {
                case '(':
                case '{':
                case '[':
                branches.add(branche);
                break;
                case ')':
                if (branches.isEmpty())
        return false;
                if(branches.get(branches.size()-1) != '(')
                return false;
                else
                branches.remove(branches.size()-1);
                break;
                case '}':
                if (branches.isEmpty())
        return false;
                if(branches.get(branches.size()-1) != '{')
                return false;
                else
                branches.remove(branches.size()-1);
                break;
                case ']':
                if (branches.isEmpty())
        return false;
                if(branches.get(branches.size()-1) != '[')
                return false;
                else
                branches.remove(branches.size()-1);
                break;
            }
        }
        if (!branches.isEmpty())
        return false;
        return true;
    }
}

```

Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>)

Explanation: So the algorythm iterate all symbols from start. First think fisrt add to the list `branches` the open branches. When algorythm come to the close branche, we  check if this is a last branche type in list and current close branche type is the same. If yes , we delete last branche, if not, we just return `false`, if we check all characters of string we return `true`.
