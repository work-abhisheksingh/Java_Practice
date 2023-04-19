class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        int n = s.length();
        int length = 0;
        // Traverse the string backwards
        for (int i = n - 1; i >= 0; i--) {
            // If we encounter a space, we're done
            if (s.charAt(i) == ' ') {
                break;
            }
            // Otherwise, we increment the length of the current word
            length++;
        }
        return length;
    }
}
