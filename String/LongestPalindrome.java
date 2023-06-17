class Solution {
    public String longestPalindrome(String s) {
    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    String longest = "";

    // Base case: single characters are palindromes
    for (int i = 0; i < n; i++) {
        dp[i][i] = true;
        longest = s.substring(i, i + 1);
    }

    // Check for palindromes of length 2 or more
    for (int len = 2; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            if (s.charAt(i) == s.charAt(j)) {
                if (len == 2 || dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    String current = s.substring(i, j + 1);
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                }
            }
        }
    }

    return longest;
}

}
