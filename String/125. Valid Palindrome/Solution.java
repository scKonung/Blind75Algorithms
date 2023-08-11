class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            System.out.println(left +" " + right);
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
