class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();//size of string
        int longest = 0;//count of the longest substring
        String subString = "";//substring

        //STEP-1 --- For-loop all symbols in the string
        for (int i =0; i < n;i++){
            Character symbol = s.charAt(i);//current symbol
            int subStringN = subString.length();//length of previous substring
            //STEP-2 --- For-loop all symbols in the substring
            for ( int j =0; j < subStringN; j++){
                Character symbolAlready = subString.charAt(j);//symbol from substring
                //STEP-3 --- Check if the symbol from string is in the substring
                if (symbolAlready.equals(symbol)){
                    //STEP-4 --- Check if it's the last symbol of the substring
                    if (j == subStringN -1){
                        /*If the symbol from string equal to the last symbol from substring,
                        that mean that the next substring, what we can check start from the
                        current symbol. For example if we have string "fgvv", tha tmean from the second
                        v we have only one string in substring.*/
                        subString = "";//reset subtring
                        break;//end for-loop(have no reason to do next)
                    }
                    subString = subString.substring(j+1);//delete previous symbol in substring
                    break;//end for-loop
                }
            }

            //STEP-5 --- Update current substring and length of the longest substring
            subString += symbol.toString();//add current symbol to the substring
            if (longest < subString.length())//check if the current substring longer that longest
            longest = subString.length();
        }

        return longest;
    }
}
