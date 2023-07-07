class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        return false;
        ArrayList<Character> letterS = new ArrayList<>();
        for (int i =0; i < s.length();i++){
            letterS.add(s.charAt(i));
        }
        for (int i=0; i < t.length(); i++){
            Character letter = t.charAt(i);
            if (!letterS.contains(letter))
            return false;
            else
            letterS.remove(letter);
        }
        return true;
    }
}
