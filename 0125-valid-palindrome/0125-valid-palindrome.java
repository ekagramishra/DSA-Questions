class Solution {
    public boolean isPalindrome(String s) {

        String s2;
        StringBuilder sb2 = new StringBuilder();

        // build cleaned original
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb2.append(Character.toLowerCase(ch));
            }
        }
        s2 = sb2.toString();

        // build cleaned reverse
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        sb.reverse();
        String newStr = sb.toString();

        return newStr.equals(s2);
    }
}
