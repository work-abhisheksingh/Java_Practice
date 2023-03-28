class Solution {
    public int myAtoi(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    
    int i = 0;
    int n = s.length();
    int sign = 1;
    int result = 0;
    
    // Skip leading whitespace
    while (i < n && s.charAt(i) == ' ') {
        i++;
    }
    
    // Check for optional sign
    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }
    
    // Read digits and convert to integer
    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
            return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        result = result * 10 + digit;
        i++;
    }
    
    // Apply sign and check for overflow
    result *= sign;
    if (result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
    }
    if (result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
    }
    
    return result;
}

}
