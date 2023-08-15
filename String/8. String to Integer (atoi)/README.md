# String to Integer (atoi)

Link to the problem [here](https://leetcode.com/problems/string-to-integer-atoi).

### [Solution](/String/8.%20String%20to%20Integer%20(atoi)/Solution.java)

```java
class Solution {
    public int myAtoi(String s) {
        long number = 0;
        boolean isNegative = false;
        boolean isZnak = false;
        boolean isNumber = false;
        int n = s.length();
        for (int i = 0; i < n;i++){
            char c = s.charAt(i);
            if (c == '-')
            {
                if (isNumber)
                break;
                isNegative = true;
                isNumber = true;
                continue;
            }
            if ( c == '+'){
                if (isNumber)
                break;
                isNumber = true;
                continue;
            }
            if (c == ' ')
           { if(isNumber)
            break;
            continue;}
            if (c > '9' || c <'0')
            break;
            isNumber = true;


            number = number * 10 + (c - '0');
            System.out.println(number);
             if ( number > 2147483647 )
            { 
            if(isNegative){
                number = -2147483648;
                isNegative = false;
            }
            else
            number = 2147483647;
            break;
            }
        }


        if(isNegative)
        {
        number *= -1;
        }

        return (int)number;
    }
}
```

Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: Simple algorythm, what iterate a character of string and search the digits.
