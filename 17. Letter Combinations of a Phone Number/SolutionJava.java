class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        ArrayList<String> result = new ArrayList<>();
        if (n == 0)
        return result;
        result.add("");
        
        ArrayList<String> lettersOfDitits = new ArrayList<>();
        for (int i =0; i< digits.length();i++){
            Character digit = digits.charAt(i);
            fieldList(lettersOfDitits, digit);
        }

        int index =0;
        fieldResult(index , result, lettersOfDitits, n);
        
        return result;
    }

    private void fieldList(ArrayList<String> letters, Character digitChar){
        int digit = Integer.parseInt(digitChar.toString());
        int charStart = 91 + 3 * digit;
        String digitLetters = "";
        if (digit > 7)
        charStart += 1;
        if (digit != 7 && digit != 9)
       { 
           for (int i = 0; i < 3; i ++){
            Character c = (char)(charStart + i);
            digitLetters += c.toString();
        }
        }
        else {
            for (int i = 0; i < 4; i ++){
            Character c = (char)(charStart + i);
            digitLetters += c.toString();
        }
        }
        letters.add(digitLetters);
    }

    private void fieldResult(int index, ArrayList<String> result, 
    ArrayList<String> lettersOfDitits, int n){
        ArrayList<String> listHelp = new ArrayList<>(result);
        result.clear();

        for(String lettersOfResult : listHelp){
            for (char letter : lettersOfDitits.get(index).toCharArray())
            result.add(lettersOfResult + letter);
        }

        index++;
        if(index == n)
        return;
        else
        fieldResult(index, result, lettersOfDitits, n);
    }
}
