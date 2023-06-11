class Solution {
    public boolean isMatch(String s, String p) {
        // Create a 2D boolean array to store the match results
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        
        // Set the initial value to true, when both s and p are empty
        dp[0][0] = true;
        
        // Deal with the patterns starting with '*'
        for(int j=1; j<=p.length(); j++) {
            if(p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }
        
        // Check for matching using dynamic programming
        for(int i=1; i<=s.length(); i++) {
            for(int j=1; j<=p.length(); j++) {
                // If the current characters match or the pattern contains a dot
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
                    dp[i][j] = dp[i-1][j-1];
                }
                // If the pattern contains a star
                else if(p.charAt(j-1) == '*') {
                    // If the star matches zero preceding elements
                    dp[i][j] = dp[i][j-2];
                    // If the star matches one or more preceding elements
                    if(p.charAt(j-2) == '.' || s.charAt(i-1) == p.charAt(j-2)) {
                        dp[i][j] = dp[i][j] || dp[i-1][j];
                    }
                }
            }
        }
        
        // Return the final result
        return dp[s.length()][p.length()];
    }
}
