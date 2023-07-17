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
