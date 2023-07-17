class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean  neg = false;
        int i = 0;
        for(; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                char ch = s.charAt(i);
                if(ch == '+' || ch == '-') i++;
                if(ch == '-') neg = true;
                break;
            }
        }
        for(; i < s.length(); i++){
            char c = s.charAt(i);
            if(c > '9' || c < '0') break;
            ans = ans * 10 + (c - '0');
            if(ans > 2147483647){
                return neg ? -2147483648:2147483647;
            }
        }
        if(neg) return (int) ans * -1;
        return (int)ans;
    }
}
