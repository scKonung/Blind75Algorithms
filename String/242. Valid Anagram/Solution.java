class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayOfS = s.toCharArray();
        char[] arrayOfT = t.toCharArray();
        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfT);
        return Arrays.equals(arrayOfS, arrayOfT);
    }
}
