class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();//size of string
        String longestSubString = String.valueOf(s.charAt(0));//longest substring
        //if isn't a palindrom in string, return the first value

        /*In this code we search a two 
        symbols, from left and right sides. If there are equals,
        then we check if this substring is Palindrom , if yes check if 
        size of this palindrom bigger that we already have */

        //STEP-1 --- Get the symbol from left side
        for (int i =0;i< n;i++){
            Character symbolLeft = s.charAt(i);//left symbol

            //STEP-2 --- Get the symbol from right side
            for (int j=n-1; j>i;j--){
                Character symbolRight = s.charAt(j);//right symbol

                //STEP-3 --- Check if this left and right symbols are equals
                if (symbolLeft.equals(symbolRight)){
                    String subString = s.substring(i,j+1);/*get a substring 
                    //with start of left symbol and end with right*/

                    //STEP-4 --- Check if this subString a palindrom
                    boolean isPalindrom = isPalindrom(subString);

                    if (isPalindrom){
                         //STEP-5 --- Check the size of palindrom
                        if (subString.length() > longestSubString.length())
                        longestSubString = subString;
                        if (subString.length() == n)//if the size of substring is size of string, return at once a string
                        return longestSubString;
                    }
                }
            }
        }
        return longestSubString;
    }

    //method for palindrom checking
    public boolean isPalindrom(String s){
        int n = s.length();//size of string

        //Using a for loop, we checking symbols from the edges and to the center
        for (int i =0; i<n/2;i++){
            Character symbolLeft = s.charAt(i);//left side symbol
            Character symbolRight = s.charAt(n-i-1);//right side symbol
            if(!symbolLeft.equals(symbolRight)){//equals cheking;
                return false;//if it's not equals return false;
            }
        }
        return true;//if after cheking in cykle a symbols return a true;
    }

}
