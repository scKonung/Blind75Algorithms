# Letter Combinations of a Phone Number

Link to the problem [here](https://leetcode.com/problems/letter-combinations-of-a-phone-number).

### [Solution](/Recursion/17.%20Letter%20Combinations%20of%20a%20Phone%20Number/Solution.java)

```java
class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();//length of digits
        ArrayList<String> result = new ArrayList<>();//result list
        if (n == 0)
        return result;//return empty list if is a empty string
        result.add("");//add the empty one string for algorythm
        
        ArrayList<String> lettersOfDitits = new ArrayList<>();//list with letters strings
        //STEP-1 --- Field the list with letters
        for (int i =0; i< digits.length();i++){
            Character digit = digits.charAt(i);//get from string a digit in character format
            fieldList(lettersOfDitits, digit);
        }

        int index =0;//index for the fieldResultMethod
        //STEP-2 --- Using a letters make the list result with methos
        fieldResult(index , result, lettersOfDitits, n);
        
        return result;
    }

    //method for STEP-1
    private void fieldList(ArrayList<String> letters, Character digitChar){
        int digit = Integer.parseInt(digitChar.toString());//get a digit in int
        int charStart = 91 + 3 * digit;//get the start letter position in ASCII table
        String digitLetters = "";//a result String, what we add in the list
        if (digit > 7)//if we have 8 or 9, here we must have a start lette ron one position up(7 have a 4 letter)
        charStart += 1;

        //check if the is a 7 or 9
        if (digit != 7 && digit != 9)
       {  //if not we must field in string only 3 letters
           for (int i = 0; i < 3; i ++){
            Character c = (char)(charStart + i);//get a character with his number
            digitLetters += c.toString();//add chrater to string
        }
        }
        else {
            //if yes field in string 4 letters
            for (int i = 0; i < 4; i ++){
            Character c = (char)(charStart + i);//get a character with his number
            digitLetters += c.toString();//add chrater to string
        }
        }
        letters.add(digitLetters);//add string to list
    }

    //methos for STEP-2
    private void fieldResult(int index, ArrayList<String> result, 
    ArrayList<String> lettersOfDitits, int n){
        ArrayList<String> listHelp = new ArrayList<>(result);//in this list we have all result from previous result list
        result.clear();//clear result list

        /*Here we get string from result list and letters from string, what from  list
        and just add first to the second to the result list. For list is used a index variable,
        where we have information what is the string.*/
        for(String lettersOfResult : listHelp){
            for (char letter : lettersOfDitits.get(index).toCharArray())
            result.add(lettersOfResult + letter);
        }

        index++;//add 1 to the index
        if(index == n)//if index is how a length of digit string end a method
        return;
        else
        fieldResult(index, result, lettersOfDitits, n);//if not with recursion do the same method for another string
    }
}
```

Time Complexity: ![O(4^n)](<https://latex.codecogs.com/svg.image?\inline&space;O(4^n)>), Space Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>)
