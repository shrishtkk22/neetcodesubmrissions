class Solution {
    public boolean isPalindrome(String s) {

        String low = s.toLowerCase();
        char[] chars = low.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(chars[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(chars[j])) {
                j--;
            }

            else if (chars[i] == chars[j]) {

                i++;
                j--;

            } else {

                return false;
            }

        }

        return true;
    }
}